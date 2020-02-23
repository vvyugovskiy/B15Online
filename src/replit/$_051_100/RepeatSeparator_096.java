package replit.$_051_100;

import java.util.Scanner;

public class RepeatSeparator_096 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i != count) {
                System.out.print(word + separator);
            } else {
                System.out.print(word);
            }


        }
    }
}