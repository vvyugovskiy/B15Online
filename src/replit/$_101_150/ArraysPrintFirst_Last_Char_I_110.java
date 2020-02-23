package replit.$_101_150;

import java.util.Scanner;

public class ArraysPrintFirst_Last_Char_I_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

//  Given a String array words, iterate through each
//  word and print first and last letter of each element in separate lines.

        //TODO: Write your code below
        for (String eachWord : words) {
            String firstLast = ""+eachWord.charAt(0)+eachWord.charAt(eachWord.length()-1);
            System.out.println(firstLast);
        }

    }
}
