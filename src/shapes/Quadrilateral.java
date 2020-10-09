package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int aLength, int aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

        public int getWidth(){
            return this.width;
        }

        public int getLength (){
            return this.length;
        }

        public abstract int setLength();

        public abstract int setWidth();




}
