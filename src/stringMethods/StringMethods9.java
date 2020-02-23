package stringMethods;

import java.util.Scanner;

public class StringMethods9 {
    public static void main(String[] args) {

//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid URL (Format Ex.: www.blackfriday.com : ");
        String email = scan.next();
        System.out.println("First Dot Index : "+email.indexOf("."));
        System.out.println("Last Dot Index : "+email.lastIndexOf("."));
        System.out.println("Domain : "+email.substring(email.indexOf(".")+1,email.lastIndexOf(".")));
    }
}