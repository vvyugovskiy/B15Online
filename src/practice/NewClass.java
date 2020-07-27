package practice;

import java.util.Calendar;
public class NewClass {


    public static void main(String[] args) {

        printAllPrimes(45);
    }

    public static void printAllPrimes (int num){
        for (int i = 2; i <= num ; i++) {
            if (isPrime(i)){
                System.out.print(i+ " | ");
            }
        }
    }

    public static boolean isPrime (int n){
        boolean isPrime = true;
        for (int i = 2; i<=n/2 ; i++){
            if (n% i == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
