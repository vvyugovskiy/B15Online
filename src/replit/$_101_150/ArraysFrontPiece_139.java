package replit.$_101_150;

import java.util.*;

public class ArraysFrontPiece_139 {

    public static void main(String[] args) {

// Given an int array of any length, print a new array of its first 2 elements.
// If the array is smaller than length 2, use whatever elements are present.

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

//    Way#1
        if (num.length < 2) {
            System.out.println(Arrays.toString(num));
        } else {
            int[] arr = {num[0], num[1]};
            System.out.println(Arrays.toString(arr));
        }

//   Way#2
        int[] arr;
        if (size >= 2) {        // can check size instead of num.length
            arr = new int[2];
            for (int j = 0; j < 2; j++) {
                arr[j] = num[j];
            }
        } else {   // or it is only 1 number in an array-->> print
            arr = new int[1];
            arr[0] = num[0];
        }
        System.out.println(Arrays.toString(arr));
    }
}
