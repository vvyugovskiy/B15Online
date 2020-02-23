package practice.mentors;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        /*
        usser input a number
        step by step we devide tris number
        4%2=0
        15%2=1
        15%3=0
        120%2=2 2 is a factor
        120/2=60
        60%2=0

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int devider = 2;

        while (number > 1) {
            if (number % devider == 0) {
                System.out.println(devider);
                number = number / devider;
                System.out.println("Divided number " + number);
                while (number % devider == 0) {
                    System.out.println(devider);
                    number = number / devider;
                    System.out.println("Divided number " + number);
                }
            }
            devider++;
        }
    }
}
