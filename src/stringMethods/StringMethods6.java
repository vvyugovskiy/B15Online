package stringMethods;

import java.util.Scanner;

public class StringMethods6 {
    public static void main(String[] args) {

//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Full Name");
        String fullName = scan.nextLine();
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println(fullName.charAt(0) + lastName + "@NightWatch.com");


    }
}
