package replit.$_051_100;

import java.util.Scanner;

public class Party_086_Do_While {
    public static void main(String[] args) {
        //  Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //        Ask for the first guest name.
        //        Then ask does user want to enter one more guest.
        //        If yes - take input from.
        //        If not - finish the program and print list of the guests.
        Scanner scan = new Scanner(System.in);
        String answer = "";
        String guest = "";
        String guest1 = "";

        System.out.println("Please enter guest name:");
        guest = scan.nextLine();
        System.out.println("Do you want to enter new guest name:");
        answer = scan.nextLine();

        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Please enter guest name:");
            guest1 = scan.nextLine();
            guest = guest + ", " + guest1;
            System.out.println("Do you want to enter new guest name:");
            answer = scan.nextLine();

        }
        System.out.println("Guest's list: " + guest);
    }
}
