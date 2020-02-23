package day17;

import java.util.Scanner;

public class NamePrinterReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String name = scan.nextLine();

        // get each corrector printed in reversed order
        // assuming we don't know the length
        // in order to print each character of a String in reverse
        // we need to start getting character
        // from index (name.length ()-1) till last index 0

        int x = name.length() - 1;
        while (x >= 0) {
            // if (x % 2 == 0) { // print even letter indexes
            // if (x % 2 != 0) { // prints odd letter indexes
                System.out.println("index " + x + " : " + name.charAt(x));
                // System.out.println(name.charAt(x));
            --x;
            }


        // System.out.println(name.charAt(1));
        // System.out.println(name.charAt(2));
        // System.out.println(name.charAt(3));
        // System.out.println(name.charAt(4));
        // System.out.println(name.charAt(5));
        // System.out.println(name.charAt(6));
        // System.out.println(name.charAt(7));
        // System.out.println(name.charAt(8));
    }
}
