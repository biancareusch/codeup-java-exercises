package shapes;
import util.Input;
public class Circle {

    private double radius;


    public int counting(String message,int count ){
        count++;
        System.out.println(message + count);
        return count;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
       return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
