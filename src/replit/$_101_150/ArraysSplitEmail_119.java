package replit.$_101_150;

import java.util.Scanner;

public class ArraysSplitEmail_119 {
    public static void main(String[] args) {

//        Given a String variable email, write code using split method to print email id and domain in separate lines.

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] words = email.split("@");

        if (!email.contains("@")|| words.length>2) {
            System.out.println("invalid email");
        } else {
            System.out.println("Email id: " + words[0]);
            System.out.println("Email domain: " + words[1]);

        }
    }
}