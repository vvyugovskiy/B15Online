package Cybertek.day20;

public class SumOfEvenOddSeperetly {
    public static void main(String[] args) {

        //loop through 10-100
        // if odd add to odd numbers
        // if even add to even numbers
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
