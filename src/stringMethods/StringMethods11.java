package stringMethods;

import java.util.Scanner;

public class StringMethods11 {
    public static void main(String[] args) {

//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with more than 1 word");
        String sentence = scan.nextLine();
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") + 1);
        System.out.println(firstWord);
        System.out.println(lastWord);

    }
}