package practice;

public class Factorial {

    public static long factorial(int n) {

        long fact = 1;
        // FOR LOOP WAY
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
//----------------------------------------------------------

    public static int factorialByAlexLee(int n) {
        // 5! = 5 * 4 * 3 * 2 * 1
        if (n == 1) {
            System.out.println("factorial (" + n + ") = 1 ");
            return 1;
        } else {
//            System.out.println("factorial (" + n + ") = " + n + " * factorial(" + (n - 1) + ")");
            return n * factorialByAlexLee(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(6));
        System.out.println(factorialByAlexLee(12));
    }
}