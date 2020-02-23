package day09;

import java.util.Scanner;

public class DayPrinter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    /*
    cereate a dayCode as int
    if the dayCode is 1 --> Monday
    if the dayCode is 2 --> Tuesday
    if the dayCode is 3 --> Wednesday
    if the dayCode is 4 --> Thursday
    if the dayCode is 5 --> Friday
    if the dayCode is 6 --> Saturday
    if the dayCode is 7 --> Sunday
    if not --> Unknown Day
     */
        System.out.println("Type a day number : ");
        int dayCode = scan.nextInt();

        if (dayCode == 1) {
            System.out.println("Day is Monday");
        } else if (dayCode == 2) {
            System.out.println("Day in Tuesday");
        } else if (dayCode == 3) {
            System.out.println("Day in Wednesay");
        } else if (dayCode == 4) {
            System.out.println("Day in Thursday");
        } else if (dayCode == 5) {
            System.out.println("Day in Friday");
        } else if (dayCode == 6) {
            System.out.println("Day in Saturday");
        } else if (dayCode == 7) {
            System.out.println("Day in Sunday");
        } else {
            System.out.println("Unknown Day");
        }
    }
}