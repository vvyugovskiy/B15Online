package replit.$_051_100;

import java.util.Scanner;

public class Factorial_092 {
    public static void main(String[] args) {

        System.out.println("Enter a whole number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial = 1;
        for (int x = 1; x <= n; x++) {
            factorial = factorial * x;
        }
        System.out.println(factorial);

    }
}
