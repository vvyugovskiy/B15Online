package replit.$_001_050;

import java.util.Scanner;

public class CaffeinOverDose_033 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int milligrams, drinks;
        System.out.println("Enter number of milligrams in drink:");
        milligrams = scan.nextInt();
        drinks = 10000/milligrams;


        System.out.println("It would take about "+drinks+" drinks for a lethal overdose.");

    }
}
