package Cybertek.day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your age ; ");

        String citizenType;
        int age = scan.nextInt();
        if (age>=65){
            citizenType = "Senior";

        }else{
            citizenType = "Not a Sitizen";
        }
        System.out.println(citizenType);

    }
}