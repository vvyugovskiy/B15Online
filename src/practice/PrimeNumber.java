package practice;

import java.util.Scanner;

/**
 * In math, prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
 * Prime numbers are divisible only by the number 1 or itself.
 */

public class PrimeNumber {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);

        System.out.print("In:");

        double max = inp.nextDouble();

        //write your code below
        System.out.println();
        int temp;
        boolean isPrime = true;
        if (max == 0 || max == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= max / 2; i++) {
                temp = (int) max % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");

        }
    }

//    public static boolean prime(int number) {
//
//        return
//    }
}
