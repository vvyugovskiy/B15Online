package Cybertek.day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        //i want to save users input after asking some question
        // and i want to save this input so i can do something with it

        // Step 1: Use Scanner class to creat scanner object
        // that have this functionality
        Scanner scan = new Scanner(System.in);
        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyboard in console for name
        // scan.next() is capturing single word that user entered

        String firstName = scan.next();
        // print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);

        //ask question for user before entering
        System.out.println("What is your age : ");
        // capture what user typed on keyboard in console for age
        //scan.nextInt() is capturing single number that user entered
        int age = scan.nextInt();
        // print the result of users age
        System.out.println("your age is : " + age);


    }
}
