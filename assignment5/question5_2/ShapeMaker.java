package question5_2;

public class ShapeMaker implements Shape {
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    @Override
    public void draw() {

    }
}
