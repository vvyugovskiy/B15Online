package Cybertek.day09;

import java.util.Scanner;

public class LanguagePicker_With_Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your language number from 1-7 : ");
        int caseCode = scan.nextInt();
        String language = "";
        switch (caseCode) {
            case 1: language = "Hello";
                break;
            case 2: language ="Salam";
                break;
            case 3: language ="Hola";
                break;
            case 4: language ="Privet";
                break;
            case 5: language ="Merhaba";
                break;
            case 6: language ="Bonjour";
                break;
            case 7: language ="Gomargoba";
                break;
            default: language ="UNKNOWN Language";


        }
        System.out.println("This is how the greeting message you get: "+language+" SDET");
    }
}