import grades.Student;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student stu1 = new Student("Bianca");
        Student stu2 = new Student("Josh");
        Student stu3 = new Student("Sam");
        Student stu4 = new Student("Chelsea");

        stu1.addGrade(100);
        stu1.addGrade(85);
        stu1.addGrade(87);

        stu2.addGrade(68);
        stu2.addGrade(96);
        stu2.addGrade(85);

        stu3.addGrade(100);
        stu3.addGrade(69);
        stu3.addGrade(86);

        stu4.addGrade(96);
        stu4.addGrade(70);
        stu4.addGrade(97);

        students.put("breusch", stu1);
        students.put("joshy", stu2);
        students.put("sammy", stu3);
        students.put("chelseaa", stu4);

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome !");
        System.out.println("\nHere are the Github usernames of our students: \n");
        for (String key : students.keySet()) {
            System.out.print(" |" + key + "| ");
        }

        System.out.println("\nWhat student would you like more information on? ");
        String userInput = scan.nextLine().trim().toLowerCase();

        if(students.containsKey(userInput)) {
            Student chosen = (Student) students.get(userInput);
            System.out.println("Name: " + chosen.getName() + " - Github Username: " + userInput +
                    "\nCurrent Average : " + chosen.getGradeAverage());
        }else {
            System.out.println("Sorry, no student found with the Github username of \"" + userInput + "\"");
        }
        System.out.println("Would you like to see another student?");
        String userBool = scan.nextLine();





    }
}
