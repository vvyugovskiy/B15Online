package Cybertek.day09;
import java.util.Scanner;
public class ABC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int languageOption;
        String greeting = "";

        System.out.print("Choose select your language from 1-7: ");
        languageOption = scan.nextInt();
        switch (languageOption) {
            case 1 : greeting = "Hello";
                break;
            case 2 : greeting = "Salam";
                break;
            case 3 : greeting = "Hola";
                break;
            case 4 : greeting = "Merhaba";
                break;
            case 5 : greeting = "Privet";
                break;
            case 6 : greeting = "Szia";
                break;
            case 7 : greeting = "Bonjour";
                break;
            default: greeting = "Unknown language";
                break;
        }
        System.out.println(greeting + " SDET!");
    }
}