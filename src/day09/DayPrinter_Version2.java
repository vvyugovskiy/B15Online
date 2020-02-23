package day09;


import java.util.Scanner;

public class DayPrinter_Version2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type a day number : ");
        int dayCode = scan.nextInt();
        String dayName;
        // String dayName = "";   // assigning an empty String value

        if (dayCode == 1) {
            dayName= "Monday";
        } else if (dayCode == 2) {
            dayName= "Tuesday";
        } else if (dayCode == 3) {
            dayName= "Wednesday";
        } else if (dayCode == 4) {
            dayName= "Thursday";
        } else if (dayCode == 5) {
            dayName= "Friday";
        } else if (dayCode == 6) {
            dayName= "Saturday";
            System.out.println("GYM TIME");
        } else if (dayCode == 7) {
            dayName= "Sunday";
        } else {
            dayName= "UNKNOWN";
        }
        System.out.println("Day is "+dayName);
    }
}