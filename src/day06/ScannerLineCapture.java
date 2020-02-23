package day06;

import java.util.Scanner;

public class ScannerLineCapture {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your Full name ?");
        String Full = blabla.nextLine();

        System.out.println("What is you past address ? ");
        String Address = blabla.nextLine();

        System.out.println("What is your current Street Address ? ");
        String Current = blabla.nextLine();

        System.out.println("Your name is : " + Full);
        System.out.println("Your previous address: " + Address);
        System.out.println("Your current address : " + Current);




    }
}
