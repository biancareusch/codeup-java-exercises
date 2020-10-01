import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.SortedMap;
import static java.lang.Float.parseFloat;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nType in any number:");
        int userInput = sc.nextInt();
        System.out.format("Your number is: %d.\n",userInput);

        System.out.print("\nThis program will take in three words and return them to you.");
        System.out.print("\nType in first word:");
        String input1 = sc.next();
        System.out.print("Type in second word:");
        String input2 = sc.next();
        System.out.print("Type in third word:");
        String input3 = sc.next();
        System.out.format("Here are your three words: %s %s %s.\n",input1, input2, input3);

        sc.nextLine();
        System.out.print("\nThis program takes in a sentence and returns it to you.");
        System.out.print("\nType in a sentence.\n");
        String userString = sc.nextLine();
        System.out.format("Here's your sentence: %s.\n",userString);


        System.out.print("\nThis program wil take in length, width and height, to calculate perimeter, area and volume\n");
        System.out.print("Length:\n");
        String lengthInput = sc.nextLine();
        System.out.print("Width:\n");
        String widthInput = sc.nextLine();
        System.out.print("Height:\n");
        String heightInput = sc.nextLine();
        float length = parseFloat(lengthInput);
        float width = parseFloat(widthInput);
        float height = parseFloat(heightInput);
        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        float volume = length * width * height;
        System.out.format("Perimeter: %.2f. Area: %.2f. Volume: %.2f", perimeter, area, volume);

        sc.useDelimiter("\n");
    }
}
