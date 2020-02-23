package stringMethods;

import java.util.Scanner;

public class StringMethods12_IFELSE {
    public static void main(String[] args) {

//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with at least 2 characters : ");
        String word = scan.next();

//        System.out.println(firstIndex);
//        System.out.println(lastIndex);
//        String firstLetter = word.substring(0, 1);
//        String lastLetter = word.substring(word.length() - 1);
//        String middlePart = word.substring(1, word.length() - 1);
        String word1 = "";
        if (word.length() == 2) {
            word1 = word.charAt(word.charAt(1))+""+word.charAt(0);
            System.out.println(word1);
          //  System.out.println(lastLetter + firstLetter);
        } else if (word.length() > 2) {
            word1 = word.charAt(word.length()-1)+""+word.substring(1, word.length() - 1)+word.charAt(0);
            System.out.println(word1);
         //   System.out.println(lastLetter + middlePart + firstLetter);
        } else {
            System.out.println("Invalid Entry");
        }


    }
}