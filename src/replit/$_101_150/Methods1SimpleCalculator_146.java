package replit.$_101_150;

import java.util.Scanner;

public class Methods1SimpleCalculator_146 {

    public static void main(String[] args) {

//        create a static method called "plus", its return is void and it gets no arguments.
//        It asks the user to input two numbers, then it will add them and print the result.
//        Create a scanner within plus method.

        plus();
    }
    public static void plus(){

        //your code here
        Scanner scan = new Scanner (System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        System.out.println("result: "+first+second);
    }
}
