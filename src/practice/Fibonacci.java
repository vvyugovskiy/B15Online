package practice;

public class Fibonacci {

    static int n1 = 1, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            printFibonacci(count - 1);
        }
    }

    // --------------------------------------------------------------------------------
    private static int fibonacci(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

// --------------------------------------------------------------------------------
    }

    public static void main(String[] args) {

//        int count = 10;
//        System.out.println(n1+" "+n2);
//        printFibonacci(count-2);

        int n = 8;
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }


}
