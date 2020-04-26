package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        double max = inp.nextDouble();
        //write your code below
        System.out.println();
        int temp;
        boolean isPrime=true;
        if (max == 0 || max == 1){
            isPrime=false;
        }else{
            for (int i = 2; i<=max/2;i++){
                temp=(int)max%i;
                if(temp==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");

        }
    }
}
