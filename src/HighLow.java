import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean confirmation;
        do {
            System.out.println("I'm thinking of a number between 1 -100.\nYou have 5 chances to guess my number... ");
            int myNum = randomNum(1, 100);
            int triesLeft = 5;
            for (int i = 0; i <= 4; i++) {
                triesLeft--;
                int userNum = sc.nextInt();
                if (userNum < myNum) {
                    System.out.println("HIGHER!");
                } else if (userNum > myNum) {
                    System.out.println("LOWER!");
                } else {
                    System.out.println("GOOD GUESS!");
                }

                System.out.println("You have tried " + (i + 1) + " times. " + triesLeft + " tries left.");
            }
            System.out.println("\nMy number was " + myNum);
            System.out.println("\nDo you want to try again? [y/N]");
            String keepGoing = sc.next();
            confirmation = keepGoing.equalsIgnoreCase("y");
        } while (confirmation);
    }


    public static int randomNum(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

}