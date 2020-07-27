package Cybertek.day05;

import java.util.Scanner;

public class HoursConvert {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("How many hours you want to convert ? : ");
        int hours = scan.nextInt();
        int seconds = hours * 3600;
        System.out.println("You entered : " + hours + " hours");
        System.out.println("It is " + seconds + " seconds after all");

        System.out.println("What is your salary per hour ? ");
        double $perHour = scan.nextDouble();
        System.out.println("Your hourly rate is :" + $perHour);

        System.out.println("How many hours a year did you work ? ");
        int hoursYear = scan.nextInt();
        System.out.println("You entered "+hoursYear+" you worked last year");

        double yearSalary = $perHour * hoursYear;
        System.out.println("Last year you made : " + yearSalary);




    }
}
