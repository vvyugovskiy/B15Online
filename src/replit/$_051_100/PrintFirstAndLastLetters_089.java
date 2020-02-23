package replit.$_051_100;

import java.util.Scanner;

public class PrintFirstAndLastLetters_089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.charAt(0)+word.substring(word.length()-1));

    }
}
