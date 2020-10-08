package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea() {
        System.out.println("The square class method");
        return side * side;
    }

    public int getPerimeter() {
        System.out.println("The square class method");
        return 4 * side;

    }

}
