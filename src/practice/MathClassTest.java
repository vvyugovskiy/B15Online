package practice;

public class MathClassTest {

    public static void main(String[] args) {

        int result = (int) Math.pow(-2.5, 3);
        System.out.println("result = " + result);

        double absl = Math.abs(result);
        System.out.println("absl = " + absl);

        int num1 = (int) Math.round(45.51);
        System.out.println("num1 = " + num1);

        double x = Math.max/* min*/ (443,22.3);
        System.out.println("x = " + x);
    }
}
