package replit.$_101_150;

import java.util.Scanner;

public class ParseJSON_104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        String firstName, lastName = "";
        firstName = json.substring(json.indexOf("firstName") + 13);
        firstName = firstName.substring(0, firstName.indexOf("\""));
        lastName = json.substring(json.indexOf("lastName")+12);
        lastName = lastName.substring(0,lastName.indexOf("\""));
        System.out.println("First name: " + firstName);
        System.out.println("Last name: "+lastName);

    }
}
