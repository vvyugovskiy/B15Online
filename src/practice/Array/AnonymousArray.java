package practice.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AnonymousArray {

    public static void main(String[] args) {

        // anonymous array is an array without reference
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);
        System.out.println(new int[]{56, 17, 89, 90, 43}[1]);

        // There are two array objects of int type. one is containing 100 elements and
        // another one is containing 10 elements. Can you assign array of 100 elements to an array of 10 elements?

        int [] a = new int [10];
        int [] b = new int [100];
        a=b; // compiler checks only if type of array is the same not the size
        System.out.println(Arrays.toString(a));

        int[] abc = new int [3];
        abc [0]=12;
        abc [1]=17;
        abc [2]=89;
        System.out.println(Arrays.toString(abc));

        ArrayList<Integer> aa = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(aa.size());
        ArrayList<Integer>a2  =new ArrayList<>(Arrays.asList(5,8,0,1,-5));
        int [] a1 = {};
        aa.addAll(a2);
        System.out.println(aa);
    }
}
