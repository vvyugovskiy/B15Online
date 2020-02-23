package replit.$_101_150;

import java.util.Scanner;

public class SliceNumber_107 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        digit1 = num / 10000;
        num = num % 10000;
        digit2 = num / 1000;
        num = num%1000;
        digit3 = num/100;
        num%=100;
        digit4=num/10;
        num%=10;
        digit5=num;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

    }
}
