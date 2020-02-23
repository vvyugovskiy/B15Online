package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

        add(5);
        add(17, 12);
        add(1, 5, 18);
        add(12L,19L);

        // Method overloading :
        //  using same name and different parameter for different methods
        //  to reuse the name for similar actions
        // IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        // method name + parameter list = method signature

        // WE CAN NOT HAVE 2 METHODS WITH SAME METHOD NAME AND SAME METHOD PARAMETERS
    }

    public static void add(int num) {
        //num = num + 100;
        System.out.println(num + 100);
    }

    public static void add(int num1, int num2) {
        //int sum = num1 + num2;

        System.out.println(num1 + num2);
    }

    public static void add(int num1, int num2, int num3) {
        //int sum = num1 + num2 + num3;

        System.out.println(num1 + num2 + num3);
    }
    public static void add(long num1, long num2) {
        //long sum = num1 + num2;

        System.out.println(num1 + num2);
    }
}