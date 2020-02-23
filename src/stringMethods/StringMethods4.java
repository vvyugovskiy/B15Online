package stringMethods;

import java.util.Scanner;

public class StringMethods4 {
    public static void main(String[] args) {

//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word with least 3 Characters : ");
        String word = scan.next();
        int charCount = word.length();
        // String last = word.substring(word.length() - 1);
        System.out.println("first : " + word.charAt(0));
        System.out.println("middle : " + word.charAt(charCount / 2 - 1));
        System.out.println("Last : " + word.charAt(charCount - 1));

    }
}
