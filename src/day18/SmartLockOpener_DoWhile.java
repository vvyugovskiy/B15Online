package day18;

import java.util.Scanner;

public class SmartLockOpener_DoWhile {
    public static void main(String[] args) {

        // smart lock door has password
        // unless you enter correck password
        // if keeps locking you out
        // assuming correct pass is B15
        // keep asking until user enter correct one

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK !!");
        // System.out.println("What Is The Password");

        String password;
        do {
            System.out.println("What Is The Password");
            password=scan.next();
        }while (! password.equals("B15"));

        System.out.println("Door Is Open");
    }
}
