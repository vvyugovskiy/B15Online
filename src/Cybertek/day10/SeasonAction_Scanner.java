package Cybertek.day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what is you favorite season?");
        String season = scan.next();
        switch (season){
            case "Spring":
                System.out.println("Hike, Easter, Blossom...");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Easter, Birthday. Halloween...");
                break;
            case "Winter":
                System.out.println("Ski, New Year, Christmas...");
                break;
            default:
                System.out.println("Have fun anyway");
        }
    }
}
