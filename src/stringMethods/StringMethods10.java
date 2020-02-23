package stringMethods;

import java.util.Scanner;

public class StringMethods10 {
    public static void main(String[] args) {

//        Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 word Sentence");
        String sent = scan.nextLine();
        int firstSpaceIndex = sent.indexOf(" ");
        int lastSpaceIndex = sent.lastIndexOf(" ");

        System.out.println("Second Word : "+sent.substring(firstSpaceIndex+1,lastSpaceIndex));

    }
}