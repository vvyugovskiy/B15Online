package introductionToJava.chapter2;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.setOut;

public class Practice {
    public static void main(String[] args) {

//2.11
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
//2.12
        System.out.println("//2.12 : " + (2 + 100) % 7); // what day of the week would be in 100 days-->> Thursday
//2.13
        System.out.println(25 / 4);
        System.out.println(25.0 / 4);
//2.14
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
//2.15
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
//2.16
        System.out.println(Math.pow(2, 3.5));
//2.17
        int m = 5;
        int r = 12;
        System.out.println(m * Math.pow(r, 2));
//2.22
        System.out.println(currentTimeMillis() / 1000 + " seconds");
//        int x = 0, a = 0, b = 0, c = 0, d = 0, t = 0;
//        System.out.println(4 / (3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d));
//        System.out.println(5.5 * (Math.pow(r + 2.5, 2.5 + r)));
//        System.out.println(Math.pow(r, 2.5 + t) + Math.pow(2.5, (2.5 + t)));
//2.24
        double a = 6.5;
        a += a + 1;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
//2.26
        int a1 = 6;
        int b1 = a1++;
        System.out.println(a1);
        System.out.println(b1);
        a1 = 6;
        b1 = ++a1;
        System.out.println(a1);
        System.out.println(b1);
//2.29
        float f = 12.5F;
        int i = (int) f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);


    }
}
