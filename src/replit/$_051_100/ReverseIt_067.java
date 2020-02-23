package replit.$_051_100;

import java.util.Scanner;

public class ReverseIt_067 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length() == 5) {
            System.out.println(word.substring(4, 5) + word.substring(3, 4) + word.substring(2, 3) + word.substring(1, 2) + word.substring(0, 1));
        } else if (word.length() < 5) {
            System.out.println("Too short!");
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        }
    }
}
