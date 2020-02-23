package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReverseSentence_137 {

    public static void main(String[] args) {

        // Given a String variable sentence, write code to
        // type each word in separate lines in a reverse order.

//        Example:
//        sentence -> "Java is fun"
//        Print
//        fun
//        is
//        Java
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String[] sts = sentence.split(" ");
        for (int i = sts.length-1; i >=0 ; i--) {
            System.out.println(sts[i]);
        }
    }
}
