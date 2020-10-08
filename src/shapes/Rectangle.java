package shapes;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int rectWidth, int rectLength) {
        this.width = rectWidth;
        this.length = rectLength;
    }

    public int getArea(int width, int length) {
        return width * length;
    }

    public int getPerimeter(int width, int length) {
        return (2 * length + 2 * width);
    }

}
