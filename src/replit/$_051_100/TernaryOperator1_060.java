package replit.$_051_100;

import java.util.Scanner;

public class TernaryOperator1_060 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE
        int number = (x >= 5) ? x : -x;
        System.out.println(number);

    }
}
