import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.SortedMap;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);

//        System.out.print("\nType in any number.\n");
//        int userInput = sc.nextInt();
//        System.out.format("\n You picked %d.",userInput);

//        System.out.print("Type in a word.");
//        String input1 = sc.next();
//        System.out.print("Type in a word.");
//        String input2 = sc.next();
//        System.out.print("Type in a word.");
//        String input3 = sc.next();
//        System.out.format("Here are your three words: %s %s %s.",input1, input2, input3);

//        System.out.print("\nType in a sentence.\n");
//        String userString = sc.nextLine();
//        System.out.format("Here's your sentence: %s.",userString);

        System.out.print("Length\n");
        String lengthInput = sc.nextLine();
        System.out.print("Width\n");
        String widthInput = sc.nextLine();
        System.out.print("Height\n");
        String heightInput = sc.nextLine();
        float length = Float.parseFloat(lengthInput);
        float width = Float.parseFloat(widthInput);
        float height = Float.parseFloat(heightInput);
        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        float volume = length * width * height;
        System.out.format("Perimeter: %.2f. Area: %.2f. Volume: %.2f", perimeter, area, volume);

//        sc.useDelimiter("\n");
    }
}
