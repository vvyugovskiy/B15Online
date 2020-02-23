package replit.$_051_100;

import java.util.Scanner;

public class FindTheLength_062 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scan.nextLine();

        int length = text.length();
        System.out.println("Length is: "+length);
    }
}
