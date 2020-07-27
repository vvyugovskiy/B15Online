package practice.Array;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        // array must be sorted
        int[] arr = {50, 7, 12, -9, 69, 4, 17};

        int key = -9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                System.out.println(key + " is found at index : "+i);
                break;
            }
        }
        byte[] byteArr = {10, 20, 15, 22, 35};
        char[] charArr = {'g', 'p', 'q', 'c', 'i'};
        double[] doubleArr = {10.2, 15.1, 2.2, 3.5};
        float[] floatArr = {10.2f, 15.1f, 2.2f, 3.5f};
        short[] shortArr = {10, 20, 15, 22, 35};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 69));

        Arrays.sort(byteArr);
        byte byteKey = 15;
        System.out.println(Arrays.binarySearch(byteArr, byteKey));
    }
}
