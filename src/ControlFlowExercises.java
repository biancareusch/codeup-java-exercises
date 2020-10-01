import java.util.Scanner;

public class ControlFlowExercises {
    //Prompt the user to enter an integer.
//Display a table of squares and cubes from 1 to the value entered.
//Ask if the user wants to continue.
//Assume that the user will enter valid data.
//Only continue if the user agrees to.
    public static void main(String[] args) {
        boolean confirmation;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What number would you like to go up to? ");
            long userInput = sc.nextInt();

            System.out.println("Here is your table! \n");
            System.out.println("\nnumber | squared | cubed");
            System.out.println("-------|---------|------");

            for (long num = 1; num <= userInput; num++) {
                long resultSquared = num * num;
                long resultCubed = num * num * num;

                System.out.println(num + "      | " + resultSquared + "       | " + resultCubed);
            }

            System.out.println("Do you want to continue? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        } while (confirmation);

    }
}
