package introductionToJava.chapter1;

import java.util.*;
public class Algebra {
    public static void main(String[] args) {

        double x,y,d,dx,dy,a1=3.4,a2=2.1,b1=50.2,b2=0.55,c1=44.5,c2=5.9;

        //3.4*x+50.2*y=44.5;
        //2.1*x+0.55*y=5.9;

        x=(c1*b2-b1*c2)/(a1*b2-b1*a2);
        y=(a1*c2-c1*a2)/(a1*b2-b1*a2);
//        d=a1*b2-b1*a2;
//        dx =c1*b2-b1*c2;
//        dy= a1*c2-c1*a2;
        System.out.println(x);
        System.out.println(y);
        System.out.println((3.4*x)+(50.2*y)==44.5);
        System.out.println((2.1*x)+(.55*y)==5.9);




    }

}
