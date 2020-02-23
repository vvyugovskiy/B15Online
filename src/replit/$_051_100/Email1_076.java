package replit.$_051_100;

import java.util.Scanner;

public class Email1_076 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        // In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.
        // System.out.println(firstWord);
        //  System.out.println(secondWord);
        if ((email.contains("_"))){
            int indexSpace = email.indexOf("_");
            int indexOfDog = email.indexOf("@");
            String firstWord = email.substring(0,indexSpace);
            String secondWord = email.substring(indexSpace+1,indexOfDog);
            String lastPart = email.substring(indexOfDog+1);
            System.out.println(secondWord+"_"+firstWord+"@"+lastPart);
        }else {
            System.out.println(email);
        }

    }
}
