package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int aLength, int aWidth) {
        super(aLength, aWidth);
        this.width = aWidth;
        this.length = aLength;
    }

    @Override
    public int setLength() {
        return 0;
    }

    @Override
    public int setWidth() {
        return 0;
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length + 2 * this.width);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}

//    private int width;
//    private int length;
//
//    public Rectangle(int rectWidth, int rectLength) {
//        this.width = rectWidth;
//        this.length = rectLength;
//    }
//
//    public int getArea() {
//        return this.width * this.length;
//    }
//
//    public int getPerimeter() {
//        return (2 * this.length + 2 * this.width);
//    }