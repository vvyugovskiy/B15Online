package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name, last name, company's name separated by space : ");

        String firstName, lastName,company,email;


        firstName = scan.next(); //"Vladislav";
        lastName = scan.next(); //"Vyugovskiy";
        company = scan.next();  //"Cybertek";

        email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is "+firstName+" "+lastName+" and i work for "+company+" and my email is "+email );


    }
}