package practice;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("Enter a whole number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        long fact = 1;

        // FOR LOOP WAY
        for (int i = 1; i <=number ; i++) {
            fact*=i;
        }
        // WHILE LOOP WAY
//        int i = 1;
//        while (i <= number) {
//            fact = fact * i;
//            i++;
//        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
