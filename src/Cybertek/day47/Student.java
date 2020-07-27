package Cybertek.day47;

public class Student {

    // final Instance field
    final int studentID;
    // public final static field with initial value set
    // THIS type of field name always suggested to make all UPPERCASES
    // in other languages called  CONSTANT
    // if interviewer ask how to define a CONSTANT in Java we answer=>>
    // I will create a public static final field
    public static final String SCHOOL = "Cybertek";

    public Student (int studentID){
        this.studentID = studentID;
    }
}
