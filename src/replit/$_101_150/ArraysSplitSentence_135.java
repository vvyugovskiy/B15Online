package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitSentence_135 {

    public static void main(String[] args) {

//        Given a String variable sentence, write code to type each word in separate lines.
//        Example:
//
//        sentence -> "Java is fun"
//        Print
//        Java
//        is
//        fun
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
       String [] sts = sentence.split(" ");
        for (String eachWord : sts) {
            System.out.println(eachWord);
        }
    }
}
