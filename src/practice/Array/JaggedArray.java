package practice.Array;

import java.util.Arrays;

public class JaggedArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8};
        int[] c = {9, 10, 11, 12, 13, 14, 15};

        int [][] arr = {{45,45,46,},{98,97,76,31,43},{12,13,14,15,16,17,18}};
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
//--------------------------------------------------------------------------------------------------------------------
        int[][] abc = {a, b, c};
        System.out.println(Arrays.deepToString(abc));
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {
                System.out.print(abc[i][j]+  "\t");

            }
            System.out.println();
        }
    }
}
