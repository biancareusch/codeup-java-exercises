import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nType in any number.");
        int userInput = sc.nextInt();
        System.out.format("\n You picked %d.",userInput);



    }
}