package Cybertek.day20;

public class Warm_Up_SumOfOdd {
    public static void main(String[] args) {
        // get the sum of odd from 10-100

        int sum = 0;
        for (int i = 10; i <= 100; i++) {

           if (i % 2 != 0) {
               sum+=i;
           }

        }
        System.out.println(sum);

//        int sum1=0;
//        for (int i = 11; i < 100; i+=2) {
//            sum1+=i;
//        }
//        System.out.println("sum = " + sum1);

    }
}
