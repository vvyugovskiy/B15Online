package replit.$_151_200;

import java.util.Scanner;

public class Methods17FibonacciNumbers_162 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
        fib(9);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int num1 = 0;
        int num2 = 1;
        int result = 0;
        if (num==0){
            result=0;
        }
        if (num==1){
            result=1;
        }
        for (int i=2;i<=num;i++){
            result=num1+num2;
            num1=num2;
            num2=result;
        }
        System.out.println(result);
    }
}
