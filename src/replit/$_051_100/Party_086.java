package replit.$_051_100;

import java.util.Scanner;

public class Party_086 {
    public static void main(String[] args) {
        //  Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
        //        Ask for the first guest name.
        //        Then ask does user want to enter one more guest.
        //        If yes - take input from.
        //        If not - finish the program and print list of the guests.

        String guest, answer,  guest1;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        guest = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        answer = input.nextLine();



        while (answer.equals("yes")) {

            System.out.println("Please enter guest name:");
            guest1 = input.nextLine();
            guest += ", " + guest1;
            System.out.println("Do you want to enter new guest name:");
            answer = input.nextLine();
        }
        System.out.println("Guest's list: " + guest);

    }
}
