package replit.$_051_100;

import java.util.Scanner;

public class PrintLastCharacter_064 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
       // int w = word.length();
        System.out.println(word.lastIndexOf(word));
        System.out.println(word.substring((word.length()-1)));




        String name = "Vladislav";
        String p1 = name.substring(8,9);
        System.out.println(p1);

    }


}
