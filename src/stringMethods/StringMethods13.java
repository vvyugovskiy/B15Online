package stringMethods;

import java.util.Scanner;

public class StringMethods13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 character word");
        String word = scan.next();

        System.out.println(""+word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(0));

    }
}
