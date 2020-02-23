package replit.$_051_100;

import java.util.Scanner;

public class CountJava_097 {
    public static void main(String[] args) {

        // Return the number of times that the string "java" appears anywhere in the given string word.

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        while(word.contains("java")){
            word=word.substring(word.indexOf("java")+4);
                count++;
            }

        System.out.println(count);

    }
}
