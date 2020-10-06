package shapes;

import util.Input;

public class CircleApp {
    private int count;

    public static void getRadius() {
        Boolean confirmation;
        do {
            Input userInput = new Input();
            double radius = userInput.getDouble("Type in a radius for your circle: ");
            Circle circle1 = new Circle(radius);
            System.out.println("Your circle radius is " + radius);
            System.out.println("The area of your circle is " + circle1.getArea());
            System.out.println("The circumference of your circle is " + circle1.getCircumference());
            circle1.counting("Amount of circles you have created: ", 0);
            confirmation = userInput.yesNo("Create another circle? ");
        } while (confirmation);

    }

    public static void main(String[] args) {
        getRadius();
    }
}
