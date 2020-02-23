package introductionToJava.chapter1;

import org.w3c.dom.ls.LSOutput;

public class Approximate {
    public static void main(String[] args) {

        double result = 4* (1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
        double result2 = 4* (1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));

        System.out.println(result);
        System.out.println(result2);
    }
}
