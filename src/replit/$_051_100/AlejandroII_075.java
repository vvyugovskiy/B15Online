package replit.$_051_100;

import java.util.Scanner;

public class AlejandroII_075 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here

//        as Alejandro is time is precious and even with his little knowledge of programming he managed to save some time. but still he had a lot of emails to read.
//        he wants to add more conditions to his program, he wants only job related mails so he will narrow it down by also checking if the word "project" also appears beside his name,
//        that way he will be sure its a job email that refers to him.

        if (a.contains("alejandro")&&a.contains("project")) {
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }


    }
}
