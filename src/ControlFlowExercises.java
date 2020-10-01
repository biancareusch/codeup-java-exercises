public class ControlFlowExercises {
    public static void main(String[] args) {

//        Create a for loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

//        Alter your loop to count backwards by 5's from 100 to -10.
        for (int x = 100; x >= -10; x -= 5) {
            System.out.println(x);
        }

//        Create a for loop that starts at 2, and displays the number squared on each line while the number is less than
//        1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
        for(long num = 2; num <= 1000000; num *=num){
            System.out.println(num);
        }

    }
}
