package Cybertek.day07;

public class Casting {

    public static void main(String[] args) {

double bigNum = 10;
        System.out.println(bigNum);
        // 12.99 is double, bigger range than
        // so it would not fit
        // int num = 12.99 ; // compiler error!!!

        int num = (int) 12.99;
        System.out.println(num);

        long earthToMoon = 280000; // ---> 10000L
        // create sn int var. and try to store above long value
        int earthToMoonIn_int = (int)earthToMoon;
        System.out.println(earthToMoonIn_int);



    }
}
