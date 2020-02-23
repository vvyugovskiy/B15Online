package day57_exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Hello B15 Online Friends");
        int [] nums = new int [3]; // 1,2,3
        nums [0] = 55;
        nums [1] = 56;
        nums [2] = 100;
        // nums [3] = 200;  // ArrayIndexOutOfBoundsException

        // System.out.println("Bye bye B15 Online Friends!");
        int result = 10/0; // ArithmeticException
        System.out.println("result is " + result);


    }
}
