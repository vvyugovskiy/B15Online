package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        combining multiple conditions together
        in JAVA there is no range check directly like in Math
        for example int x = 70
        in math : 60 < x < 100 ->true <100
        in Java : x > 60 && x < 100
        && 2 ampersand & 1 ampersand --> Logical and Operator
        Used to check both conditions are true at the same time

        int x =70;    x > 60 && <100; true

        int x = 10:   x >60 && <100; false

        int x = 110:   x >60 && <100; false

        int x = 99:   x >60 && <100; true
         */

        /*
        || double pipe used for compiling 2 conditon: Logical Or Operator
        if at least 1 condition is true the whole condition is true!
         */

        System.out.println( "TRUTH TABLE &&");

        System.out.println( "RESULT OF true && true  is " +   (true && true)    );
        System.out.println( "RESULT OF false && true  is " +  (false && true)    );
        System.out.println( "RESULT OF true && false  is " +  (true && false)    );
        System.out.println( "RESULT OF false && false  is " + (false && false)    );

        System.out.println( "TRUTH TABLE ||");

        System.out.println( "RESULT OF true || true  is " +   (true || true)    );
        System.out.println( "RESULT OF false || true  is " +  (false || true)    );
        System.out.println( "RESULT OF true || false  is " +  (true || false)    );
        System.out.println( "RESULT OF false || false  is " + (false || false)    );

        int x = 55;
        System.out.println(x > 100 || x < 10);
        System.out.println(x > 10 && x < 60);
        // more than 2 conditions at the same time ,  3 conditions
        //true || falsae --->> true
        System.out.println(  true || false || false  );
        //   true  && false  ----->> false
        System.out.println(  true && true && false  );

        System.out.println(5>10 && 9/0 ==3);
        System.out.println(5>10 & 9/0==3 );
    }
}
