package Cybertek.day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        // +-*/
        // %

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);
        // 5 / 2 is 2 and remainder is 1
        System.out.println(7.9%2);

        System.out.println(99%10); // 10*9 + 9=99

        System.out.println(100%10); // 10*10+0=100

        // declare a minute  int
        // ask user to enter a minute
        // print the result in x hour y minite format
        // for example 135 min, 2 hours and 15 min

        int minutes, hours;
        System.out.println("How many minutes till we meet ? ");
        minutes = min.nextInt();
        hours = minutes/60;
        System.out.println("We will meet in "+hours+" hours and "+minutes%60+ " minutes");

        int minS = 135;
        int hourPart = 135/60;
        int minsPart = 135%60;

        System.out.println("The minutes "+minS+ " is " + hourPart + " hours and "+  minsPart+ " minutes");
    }
}
