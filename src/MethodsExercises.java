import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput > min && userInput < max) {
            System.out.println("Valid number.");
        } else {
            System.out.println("Invalid number.\n Try again: ");
            getInteger(min,max);
        }
        return userInput;
    }

    public static void adding(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtracting(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void multiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void division(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void modulus(int a, int b) {
        int result = a % b;
        System.out.println(result);
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



