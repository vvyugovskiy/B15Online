package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        System.out.println("Enter the score");
        score = scan.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE");
        } else if (score == 100) {
            System.out.println("PERFECT SCORE");

        } else if (score >= 70 && score <= 100) {
            System.out.println("YOU HAVE PASSED");
        }else if (score <= 20 && score >= 0) {
            System.out.println("Come to my Office");
        }else if (score >= 30 && score <= 70) {
                System.out.println("Need More Study");
    }
}
}