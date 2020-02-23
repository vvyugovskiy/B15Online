package replit.$_051_100;

import java.util.Scanner;

public class PrefixAgain_099 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
// Given a string, consider the prefix string made of the first n chars of the string.
// Does that prefix string appear somewhere else in the string?
// Assume that the string is not empty and that n is in the range from 1 till str.length().
        String prefix = str.substring(0,n);
        System.out.println(str.substring(n).contains(prefix));


    }
}

