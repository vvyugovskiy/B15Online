package replit.$_051_100;

import java.util.Scanner;

public class PrintTheLongestWord_070 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        // Write a program that will print out the longest word.

        //WRITE YOUR CODE HERE
        if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else if (word2.length() > word1.length()) {
            System.out.println(word2);
        }
    }
}
