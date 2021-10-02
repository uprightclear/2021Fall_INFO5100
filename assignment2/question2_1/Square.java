package question2_1;

public class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
        setArea(side * side);
        setPerimeter(side * 4);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
