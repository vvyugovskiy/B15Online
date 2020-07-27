package Cybertek.day12;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        String season;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season Please");
        season = scan.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Cool weather, May...");
        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("Beach, Sun, Watermelon...");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Halloween, Thanksgiving, Birthday...");
        }else if (season.equalsIgnoreCase("winter")) {
            System.out.println("Skiing, Christmas, New Year...");
        }else{
            System.out.println("Whatever");
        }
    }
}
