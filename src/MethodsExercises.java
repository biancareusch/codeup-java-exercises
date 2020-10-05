import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//dice(sc);

        //getInteger
        int userInput = getInteger(1, 10);

        //factorial
        Boolean confirmation;
        do {
            System.out.print(factorial(getInteger(1, 16)));
            System.out.println("\nDo you want to try again? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        } while (confirmation);

    }

    public static void dice(Scanner sc) {
        Boolean confirmation;
        do{
        System.out.print("Enter the number of sides for a pair of dice: ");
        int n = sc.nextInt();
        int dice1 = randomize(n);
        int dice2 = randomize(n);
            System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
            System.out.println("\nDo you want to try again? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        }while(confirmation);
    }

    public static int randomize(int n) {
        return (int) (Math.random() * n ) + 1;
    }

    public static int factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) (n * factorial(n - 1));
        }
    }

    public static int getInteger(long min, long max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number between " + min + " and " + max + ": ");
        long userInput = scan.nextInt();
        if (userInput < min) {
            System.out.println("Number is less than " + min);
            getInteger(min, max);
        } else if (userInput > max) {
            System.out.println("Number is more than " + max);
            getInteger(min, max);
        } else {
            System.out.println("Thank you");
        }
        return (int) userInput;
    }

    public static int adding(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    public static int subtracting(int a, int b) {
        int result = a - b;
        System.out.println(result);
        return result;
    }

    public static int multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return result;
    }

    public static int division(int a, int b) {
        int result = a / b;
        System.out.println(result);
        return result;
    }

    public static int modulus(int a, int b) {
        int result = a % b;
        System.out.println(result);
        return result;
    }

    public static int multi(int factor, int base) {
        int result = 0;

        for (int i = 0; i < base; i++) {
            result = result + factor;
            System.out.println(result);
        }

        return result;
    }


}



