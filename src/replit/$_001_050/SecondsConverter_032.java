package replit.$_001_050;

import java.util.Scanner;

public class SecondsConverter_032 {
    public static void main(String[] args) {

    Scanner object = new Scanner(System.in);
    int inputSeconds, hours, minutes, seconds;
    System.out.println("Enter seconds:");
    inputSeconds = object.nextInt();
    hours = inputSeconds/3600;
    minutes = (inputSeconds%3600)/60;
    seconds = inputSeconds%60;


    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
}
}