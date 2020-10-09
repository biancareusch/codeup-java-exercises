package shapes;

public class Square extends Quadrilateral {

protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }


    public int setLength() {
        return this.side;
    }

    public int getWidth(){
        return this.side;
    }

    public int setWidth() {
        return this.side;
    }


    public int getLength() {
        return super.getLength();
    }



    public double getPerimeter() {
        System.out.println(this.side);
        return this.side * 4;
    }
//shapes.Square is not abstract and does not override abstract method getPerimeter() in shapes

    public double getArea() {
        return this.side * this.side;
    }
}


//    private int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        System.out.println("The square class method");
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        System.out.println("The square class method");
//        return 4 * side;
//
//    }