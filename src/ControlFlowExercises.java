import java.util.Scanner;

public class ControlFlowExercises {
//    Prompt the user for a numerical grade from 0 to 100.
//    Display the corresponding letter grade.
//    Prompt the user to continue.
//    Assume that the user will enter valid integers for the grades.
//    The application should only continue if the user agrees to.
//    Grade Ranges:
//
//    A : 100 - 88
//    B : 87 - 80
//    C : 79 - 67
//    D : 66 - 60
//    F : 59 - 0
    public static void main(String[] args) {
        boolean confirmation;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type in your numerical grade: ");
            int userInput = sc.nextInt();

            if(userInput > 99){
                System.out.println("You have an A+!");
            } else if(userInput >= 90 && userInput < 99){
                System.out.println("You have an A!");
            }else if(userInput >= 88 && userInput < 90){
                System.out.println("You have an A-!");
            }else if(userInput >= 86 && userInput < 88){
                System.out.println("You have an B+!");
            }else if(userInput >= 82 && userInput < 86){
                System.out.println("You have an B!");
            }else if(userInput >= 80 && userInput < 82){
                System.out.println("You have an B-!");
            }else if(userInput >= 78 && userInput <80){
                System.out.println("You have an C+!");
            }else if(userInput >= 69 && userInput < 78){
                System.out.println("You have an C!");
            }else if(userInput >= 67 && userInput < 69){
                System.out.println("You have an C-!");
            }else if(userInput >= 65 && userInput < 67){
                System.out.println("You have an D+!");
            }else if(userInput >= 62 && userInput < 65){
                System.out.println("You have an D!");
            }else if(userInput >= 60 && userInput < 62){
                System.out.println("You have an D-!");
            }else if(userInput < 60){
                System.out.println("You have an F!");
            }


            System.out.println("Do you want to continue? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        } while (confirmation);

    }
}
