package replit.$_101_150;

import java.util.Scanner;

public class ArraysPrinting_01_109 {
    public static void main(String[] args) {
//  The code provided in your main method will take in five Strings and save them into an array called arr.
//  Print out the first three letters of each element of arr, one per line.
//  You can assume that every element of arr is at least 3 letters long.
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items
        //write your code below
        for (String eachStr : arr) {
            String first3 = ""+ eachStr.charAt(0) + eachStr.charAt(1) + eachStr.charAt(2);
            System.out.println(first3);
        }

    }
}
