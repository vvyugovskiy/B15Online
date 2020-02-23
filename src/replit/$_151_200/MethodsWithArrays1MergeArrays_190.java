package replit.$_151_200;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsWithArrays1MergeArrays_190 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] arr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arr[i + a.length] = b[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
