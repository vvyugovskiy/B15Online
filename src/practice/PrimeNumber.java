package practice;

import java.util.Scanner;

/**
 * In math, prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
 * Prime numbers are divisible only by the number 1 or itself.
 */

public class PrimeNumber {

        public static void main(String args[]) {

        Scanner num = new Scanner(System.in);
        System.out.print("In:");
        int max = num.nextInt();

        printAllPrimes(max);

    }

    public static boolean prime(int number) {
        boolean returnValue = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {  // check if divisible by any other numbers
                returnValue = false;
                break;

            }
        }
        return returnValue;
    }

    public static void printAllPrimes (int number){

        for (int i=2; i<=number; i++){
            if (prime(i)){
                System.out.print(i+" | ");
            }
        }
    }
}
