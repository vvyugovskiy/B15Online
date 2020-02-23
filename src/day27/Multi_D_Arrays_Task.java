package day27;

import java.util.Arrays;

public class Multi_D_Arrays_Task {
    public static void main(String[] args) {

        int[][] numbers = {{12,11,10,19},{19,20,15},{100,90,89,7888}};
        int max = numbers [0][0]; // assume that first element is the max

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max<numbers[i][j]){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println(max);

        // solution 2:
        int max2 = numbers [0][0];
        for (int[] each1Darray : numbers) {  // variable represents each singleD arrais in numbers
            for (int eachInt : each1Darray) {
                if (max2<eachInt){
                    max2=eachInt;
                }
            }
        }
        System.out.println(max2);

        // find the smallest number
        int min = numbers [0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min>numbers[i][j]){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println("==========================================");

    }
}


