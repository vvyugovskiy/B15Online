package office_hours.Practice_2020_02_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;

    }

    @Override // override annotation
    public String toString() {

        return studentName;
    }
}

class School {

    String schoolName;
    List<Student> allStudentsList;

    public School(String schoolName, List<Student> allStudentsList) {
        this.schoolName = schoolName;
        this.allStudentsList = allStudentsList;
    }

    // add 1 Student into a List of Students
    public void addNewStudent(Student student) {
        this.allStudentsList.add(student);
    }

    // add an Array of Students
    public void addNewStudent(Student[] students) {
        this.allStudentsList.addAll(Arrays.asList(students));
    }

    // add a List of Students
    public void addNewStudent(List<Student> listOfStudents) {
        this.allStudentsList.addAll(listOfStudents);
    }

    public String toString() {
        return "" + allStudentsList;
    }
}

public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Hasan");
        System.out.println(s1);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeyye");
        Student s5 = new Student("Parvin");
        List<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        School cybertek = new School("Cybertek", list);
        cybertek.addNewStudent(new Student("Irina"));
        cybertek.addNewStudent(new Student("Denis"));

        Student[] students = {
                new Student("Ruksana"),
                new Student("Gulnaz")
        };
        cybertek.addNewStudent(students);

        System.out.println(cybertek.allStudentsList);
        // System.out.println(cybertek.schoolName);

        for (Student each : cybertek.allStudentsList) {
            System.out.println("\t\t" + each);
        }
        System.out.println(cybertek);
    }

}
