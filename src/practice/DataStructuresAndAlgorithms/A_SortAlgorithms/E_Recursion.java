package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;

public class E_Recursion {

    public static void main(String[] args) {


        System.out.println(iterativeFactorial(3));  // usually faster, more memory efficient
        System.out.println(recursiveFactorial(3));  // more elegant, easier to write
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n - 1)!

    // CALL STACK__________
    // 3. recursiveFactorial(1)
    // 2. recursiveFactorial(2)
    // 1. recursiveFactorial(3)

    public  static int recursiveFactorial (int num){
        if (num==0){  // BASE CASE / BREAKING CONDITION
            return 1;  // StackOverflow ERROR if NO BASE CASE(BREAKING CONDITION)
        }
        return num * recursiveFactorial(num-1);

    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 0; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
