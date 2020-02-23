package practice.loop;

import java.util.Scanner;

public class WhileLoopPositiveInteger {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive Integer");
        int total = 0;
        int nextNum = keyboard.nextInt();
        while (nextNum>0){
            total = total+nextNum;
            nextNum = keyboard.nextInt();
        }
        System.out.println("Sum of all numbers "+total);

    }
}