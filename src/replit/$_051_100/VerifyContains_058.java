package replit.$_051_100;

import java.util.Scanner;

public class VerifyContains_058 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        boolean b1 = sentence.contains(word);
        System.out.println(b1);

    }
}
