package day05;


import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is a Temperature in F today ? ");

        double F = scan.nextDouble();
        double C = (5.0/9)*(F-32);

        System.out.print("The temperature in F entered : " + F);
        System.out.println("\tso temperature in C : " + C);



    }
}

