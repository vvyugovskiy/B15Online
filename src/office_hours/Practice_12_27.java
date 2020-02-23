package office_hours;

public class Practice_12_27 {

    public static void main(String[] args) {

        String aa = "ABCDEFG";
        for (int i = aa.length() - 1; i >= 0; i--) {
            System.out.print(aa.substring(i, i + 1));
        }
        System.out.println();
        String a1 = "Esra Fidan";

        method2();

        float num1 = 10.5f;
        double num2 = num1;

        double number1 = method3();
        System.out.println(Eligible(10));
        System.out.println(Eligible(45));
    }

    public static void method1() {
        System.out.println("Hello Batch 15");
        // return 10;  // return type is VOID - can npt return any value
    }

    public static void method2() {
        if (false) {
            return;  // exits the current method
        }
        System.out.println("Test completed");
    }

    public static double method3() {
        // if return type is not void, the method MUST return a value at the end
        // String str = "Alesya";
        return 10.5f;
    }

    public static boolean Eligible(int age) {
        if (age >= 35) {
            return true;
        }
        return false;
    }
}
