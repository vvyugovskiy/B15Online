package practice.loop;

import java.util.Scanner;

public class WhileLoopNumbersProgram {
    public static void main(String[] args) {
int count, number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        number = keyboard.nextInt();
        count = 1;
        while (count<=number){
            System.out.print(count+", ");
            count++;
            // count +=2;
            // count +=7;
        }

    }
}