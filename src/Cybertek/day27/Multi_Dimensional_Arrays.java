package Cybertek.day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    /*
    Single dimensional array: contains values
            int [] arr = {1,2,3};

     Multi-dimentional array: an Array that contains array(s)
             N dimensional Array contains (N-1) dimensional arrays
             EX: 2 dimensional array
      */
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3};
        // [[index num of elements]
            // arr1D[1]==>>2
        // 2d arry: is an array that contains single dimensional arrays
        //                0  1  2    0  1  2
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        // index             0          1

        //[INDEX NUM OF 1D ARRAYS] []

        // arr2D[0]==> {1,2,3}
         System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2] ==> 3
        System.out.println(arr2D[0][2]); // returns int value

        //print 5: arr2D [1][1]
        System.out.println(arr2D [1][1]);

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(Arrays.deepToString(arr2D));
    }
}
