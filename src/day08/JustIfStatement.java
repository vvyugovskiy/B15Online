package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed ? ");
        int currentSpeed = scan.nextInt();
        System.out.println("What is a speed limit ? ");
        int speedLimit = scan.nextInt();

        if (currentSpeed >=speedLimit) {

            System.out.println("Get pulled over");
            System.out.println("Money loss");
            System.out.println("Points loss");
            System.out.println("Get pulled over");
        }
        //else {
            System.out.println("Get some ice cream");

       //  }  // there is no else, program just move on
        System.out.println("The End Of The Story");


    }
}
