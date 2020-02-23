package day05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {

        /*
        ask user for name
        and capture the result
        print your name as is
        ask user for birth year
        and capture the result
        print hte age
        ask user for height
        and capture the result
        print hte result
         */

        Scanner name = new Scanner(System.in);
        System.out.println("What is your name ? ");
        // String name = "Sam";
        String firstName = name.next();
        System.out.println("My name is " +firstName);

        System.out.println("What is your birth year ? ");
        int birthYear = name.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is : " + age);

        System.out.println("What is your height ? ");
        Double height = name.nextDouble();
        System.out.println("Your height you entered is ; " + height);

        System.out.println("I am "+firstName + " and I was born in "+birthYear+ " and I am "+height);















    }
}
