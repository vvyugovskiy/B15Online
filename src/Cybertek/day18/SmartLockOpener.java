package Cybertek.day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        // smart lock door has password
        // unless you enter correck password
        // if keeps locking you out
        // assuming correct pass is B15
        // keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK !!");
        System.out.println("Wnat Is The Password");

        // entering password for the first time

        String password = scan.next();

        while (! password.equals("B15")){
            System.out.println("Wrong PASSWORD");
            password = scan.next();
        }
        System.out.println("OPEN SESEME!!");
    }
}
