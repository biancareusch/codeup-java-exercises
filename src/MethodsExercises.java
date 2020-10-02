public class MethodsExercises {
    public static void main(String[] args) {
        adding(2, 6);
        subtracting(9, 2);
        multiplication(6, 4);
        division(9, 3);
        modulus(9, 4);
        multi(3, 5);
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
        } else if (factor == 3){
            System.out.println(base + base + base);
        } else if (factor == 4){
            System.out.println(base + base + base + base);
        }else{
            System.out.println("sorry...");
        }

    }
}



