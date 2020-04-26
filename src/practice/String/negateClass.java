package practice.String;


public class negateClass {
    public static void main(String[] args) {

        System.out.println(negate(-7));
        System.out.println(negate(7));

    }

    public static double negate(double a) {
        if (a > 0) {
            return a = a * -1;
        } else if (a < 0) {
            return a = Math.abs(a);
        } else {
            return a;
        }
    }
}