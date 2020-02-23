package replit.$_051_100;

import java.util.Scanner;

public class PrintHalfTwice_069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String half = word.substring(0,word.length()/2);
        System.out.println(half);

    }
}
