package stringMethods;

import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {

//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program to print users initials
//        for example :
//        Jon Snow -->> Initial is JS

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Full Name");
        String fullName = scan.nextLine();
        // String firstName = fullName.substring(0,fullName.indexOf(" "));
        // String lastName = fullName.substring(fullName.indexOf(" "));
        // int firstIndex = fullName.indexOf(0);
        int lastIndex = fullName.indexOf(" ")+1;
        // System.out.println("firstName = " + firstName);
        // System.out.println("lastName = " + lastName);
        // String initials =
        System.out.println(fullName.charAt(0)+""+fullName.charAt(lastIndex));
    }
}
