package Cybertek.day29;

import java.util.Arrays;

public class FillingUpArrayValue {
    public static void main(String[] args) {

        // create an array with size 100 and fill it up as below

        int[] numbers = new int[100];

        System.out.println("Before filling up  \n" + Arrays.toString(numbers));

//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[2]=3;
//         .........
//        numbers[99]=100;
        for (int x = 0; x < numbers.length; x++) {

            numbers[x] = x * 2;
        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

        System.out.println("++++++++++++++++++++++++++++++++");
        String[] java300 = new String[300];
        for (int i = 0; i < java300.length; i++) {
            java300[i] = i + 1 + " I love Java";
            // java300[i]=" I love Java";
        }
        System.out.print(Arrays.toString(java300));
    }
}
