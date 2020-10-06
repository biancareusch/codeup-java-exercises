import java.util.Arrays;

public class ArraysExercises extends Person{
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        String[] Persons = {"john", "bob", "mike"};
        Person person2 = new Person(Persons[0]);
        Person person3 = new Person(Persons[1]);
        Person person4 = new Person(Persons[2]);

        for(String person : Persons){
            System.out.println("person = " + person);
        }

    }


//    public static Arrays addPerson(Arrays Persons, Person name){
//        String personName = name.toString();
//        Person newPerson = new Person(personName);
//
//        String[] newPersons ;
//
//        Arrays.fill(newPersons, Persons.name);
//
//        return Arrays newPersons;
//    }
}
