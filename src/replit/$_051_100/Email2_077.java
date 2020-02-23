package replit.$_051_100;

import java.util.Scanner;

public class Email2_077 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexSpace = email.indexOf("_");
        int indexOfDog = email.indexOf("@");
        int indexOfDot = email.indexOf(".");
        String firstName = email.substring(0, indexSpace).toUpperCase();
        String firstNameCor = firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
        String lastName = email.substring(indexSpace+1,indexOfDog);
        String lastNameCor = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        String domain = email.substring(indexOfDog+1,indexOfDot);
        String topDomain = email.substring(indexOfDot+1);
        System.out.println("First name: " + firstNameCor);
        System.out.println("Last name: " + lastNameCor);
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topDomain);

    }
}
