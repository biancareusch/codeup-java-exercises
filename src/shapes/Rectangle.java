package shapes;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int rectWidth, int rectLength) {
        this.width = rectWidth;
        this.length = rectLength;
    }

    public int getArea() {
        return this.width * this.length;
    }

    public int getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }

}

