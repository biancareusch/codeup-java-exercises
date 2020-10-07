import java.util.Arrays;

public class ArraysExercises extends Person {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];

        persons[0] = new Person("Fer");
        persons[1] = new Person("John");
        persons[2] = new Person("Bianca");

        for (Person person : persons) {
            person.sayHello();
        }

int n = 5;
        System.out.println(Arrays.toString(addPerson(n, persons, new Person("Lisa"))));

    }


    public static Person[] addPerson(int n, Person[] persons, Person name) {

        Person newArray[] = new Person[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = persons[i];

            newArray[n] = name;
        }
        return newArray;

    }
}
