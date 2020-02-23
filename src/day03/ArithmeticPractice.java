package day03;

public class ArithmeticPractice {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 20;

        int sum = n1 + n2;
        int sbst = n1 - n2;
        int division = n1 / n2;
        int miltip = n1 * n2;
        int remaind = n1 % n2;

        System.out.println(sum+","+sbst+","+division+","+miltip+","+remaind);

        int num1 = (4 + 3) * 2;
        System.out.println(num1);

        num1 = 4 + 3 * 2;
        System.out.println(num1);

        num1 = (4+3) * 2 + 4 /  2;
        System.out.println(num1);

        byte b = 10 ;
                short sh = 20;
        //short total =  b + sh; will not compile
        int total = b + sh;
        System.out.println(total);

















    }
}
