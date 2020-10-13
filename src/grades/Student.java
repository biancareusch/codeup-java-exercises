package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return this.name;
    }

    ;

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    ;

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        int average = total / grades.size();
        return average;
    }

    public static void main(String[] args) {
        Student stu1 = new Student("Bianca");
        Student stu2 = new Student("Josh");

        stu1.getName();
        System.out.println("stu1.getName() = " + stu1.getName());
        stu2.getName();
        System.out.println("stu2.getName() = " + stu2.getName());

        stu1.addGrade(100);
        stu1.addGrade(50);

        stu2.addGrade(70);
        stu2.addGrade(90);
        stu2.addGrade(100);

        stu1.getGradeAverage();
        stu2.getGradeAverage();

        System.out.println("stu1.getGradeAverage() = " + stu1.getGradeAverage());
        System.out.println("stu2.getGradeAverage() = " + stu2.getGradeAverage());

    }

}
