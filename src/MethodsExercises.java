import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getInteger
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

        //factorial
        Boolean confirmation;
//        do {
//            System.out.print("Enter a number between 1 and 16: ");
//            System.out.print(factorial(getInteger(1, 16)));
//            System.out.println("\nDo you want to try again? [y/N]");
//            String keepGoing = sc.next();
//            confirmation = keepGoing.equalsIgnoreCase("y");
//        } while (confirmation);

        // Dice
        do{
        System.out.print("Enter the number of sides for a pair of dice: ");
        int n = sc.nextInt();
        int dice1 = dice(n);
        int dice2 = dice(n);
            System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));
            System.out.println("\nDo you want to try again? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        }while(confirmation);
    }

    public static int dice( int n) {
            return (int)(Math.random() * n) + 1;
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
        long userInput = scan.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.\n Try again: ");
            getInteger(min, max);
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

    public static void multi(int factor, int base) {
        if (factor == 0) {
            System.out.println(0);
        } else if (factor == 1) {
            System.out.println(base);
        } else if (factor == 2) {
            System.out.println(base + base);
        } else if (factor == 3) {
            System.out.println(base + base + base);
        } else if (factor == 4) {
            System.out.println(base + base + base + base);
        } else {
            System.out.println("sorry...");
        }
    }
}



