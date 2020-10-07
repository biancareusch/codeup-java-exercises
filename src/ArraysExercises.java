import java.util.Arrays;

public class ArraysExercises extends Person {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person[] persons = new Person[3];

        persons[0] = new Person("Fer");
        persons[1] = new Person("John");
        persons[2] = new Person("Bianca");

//        for (Person person : persons) {
//            person.sayHello();
//        }

        addPerson(persons, new Person("Monkey"));

    }


    public static void addPerson(Person[] persons, Person newPerson) {

        Person[] copyOfPerson = Arrays.copyOf(persons, persons.length + 1);
        copyOfPerson[copyOfPerson.length - 1] = newPerson;
        for (Person newbie : copyOfPerson) {
            System.out.println(newbie.getName());
        }


    }
}
