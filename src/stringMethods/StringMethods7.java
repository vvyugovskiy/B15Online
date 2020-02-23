package stringMethods;

import java.util.Scanner;

public class StringMethods7 {
    public static void main(String[] args) {

//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid email address");
        String email = scan.next();
        String partOne = email.substring(0, email.indexOf("@"));
        String partTwo = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        String partThree = email.substring(email.lastIndexOf(".")+1);
        System.out.print("Part 1 : " + partOne + " Part 2 : " + partTwo + " Part 3 : "  +partThree);

    }
}