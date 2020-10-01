public class ControlFlowExercises {
    public static void main(String[] args) {
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
            i++;
        }

//
//        for (int x = 1; x <= 100; x++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (x % 3 == 0){
//                System.out.println("Fizz");
//            } else if(x % 5 == 0){
//                System.out.println("Buzz");
//            } else if(x % 3 != 0 && x % 5 != 0) {
//                System.out.println(x);
//            }
        }
    }
}
