package question2_1;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(int side) {
        this.width = side;
        this.height = side;
        setArea(width * height);
        setPerimeter((width + height) * 2);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        setArea(width * height);
        setPerimeter((width + height) * 2);
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
        setArea(width * height);
        setPerimeter((width + height) * 2);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
