package stringMethods;

import java.util.Scanner;

public class StringMethods14 {
    public static void main(String[] args) {
//
//        Ask user to enter sentence with any number of words
//        For example I love Java Java Java Java
//        write a program to print last word
//        remove last word from the sentence
//        check weather remaining part still contains last word

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with many words");
        String s = scan.nextLine();
        int indexLastSpace = s.lastIndexOf(" ");
        String lastWord = s.substring(indexLastSpace + 1);
        System.out.println(lastWord);
        String remaining = s.substring(0,indexLastSpace);
        System.out.println(remaining);
        if (remaining.contains(lastWord)){
            System.out.println("Remainder contains word : " +lastWord);
        }else{
            System.out.println("Remainder DOES NOT contain Word : "+lastWord);
        }
    }
}
