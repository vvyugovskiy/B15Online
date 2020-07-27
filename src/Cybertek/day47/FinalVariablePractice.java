package Cybertek.day47;

public class FinalVariablePractice {

    public static void main(String[] args) {

        int x= 10; // declaring and initializing a variable
        x=100; // changing the x to a new value to the variable

        // declaring and initializing a final variable
        // declaring and assigning initial value to a final variable
        final int a = 20;
        // a=200; // can not change value of a from 20 into 200, a IS FINAL

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        // can not re-assign class, IT"S FINAL ALSO
        // s1 = new Student(102);
        // s1.studentID = 200;
        System.out.println(s1.studentID);

        System.out.println(Student.SCHOOL);
        // can not re-assign
        // Student.school = "abc";

        // INTELLIJ AUTOMATICALLY RECOGNIZE CONSTANT (public static final field)
        // it will automatically make it italic (This can not be done by programmer)
        // easy way to distinguish between fields and methods is
        // by looking at () at the end
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Math.PI);

        printDoubleNumber(12);

        final String name = "Michael";
        // name = "Vlad"; => cant re-assign

    }
    /**
     * a void method that accept a number and print out doubled number
     *
     * @param x
     */
    // anywhere we declare a variable we have option to make it final (including method parameter)
    // making method parameter final
    // it will make the method only use the argument user passed without modifying it ;
    public static void printDoubleNumber (final int x){
        System.out.println(x*2);
//        x=x*2;
//        System.out.println("x*2" + x);
    }
}
