package day09;

import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type in your language number from 1-7 : ");
        int languageOption= scan.nextInt();
        String greeting="";


        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting= "Salam";
        } else if (languageOption == 3) {
            greeting= "Hola";
        } else if (languageOption == 4) {
            greeting= "Privet";
        } else if (languageOption == 5) {
            greeting= "Merhaba";
        } else if (languageOption == 6) {
            greeting= "Bonjour";
        } else if (languageOption == 7) {
            greeting= "Gomargoba";
        } else {
            greeting= "UNKNOWN Language";
        }
        System.out.println("This is how the greeting message you get: "+greeting+" SDET");


    }
}
