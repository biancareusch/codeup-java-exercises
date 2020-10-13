import java.util.Arrays;

public class ArraysExercises extends Person {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];

//        persons[0] = new Person("Fer");
//        persons[1] = new Person("John");
//        persons[2] = new Person("Bianca");

        //another way to solve this problem
        Person onePerson = new Person("Fer");
        Person secondPerson = new Person("John");
        Person thirdPerson = new Person("Bianca");


        persons[0] = onePerson;
        persons[1] = secondPerson;
        persons[2] = thirdPerson;

//        for (Person person : persons) {
//            person.sayHello();
//        }

        addPerson(persons, new Person("Monkey"));

    }


    public static Person[] addPerson(Person[] originalArray, Person newPerson) {
        Person[] copyOfPerson = Arrays.copyOf(originalArray, originalArray.length + 1);
        copyOfPerson[copyOfPerson.length - 1] = newPerson;
        for (Person newbie : copyOfPerson) {
            System.out.println(newbie.getName());
        }
        return copyOfPerson;

    }
}
