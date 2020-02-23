package office_hours;

import java.util.Arrays;

public class Practice_12_12 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3}; // ==> 3
        arr = new int[4];
        System.out.println(Arrays.toString(arr));
        // 1,2,3,0
        // 0,0,0,0
        int[] arr2;
        // System.out.println(arr2[0]); // arrays size is fixed. without initializing bits size we cannot use it

        String[] names = new String[5];
        names[2] = "Hasan";
        names[4] = "Parvin";
        System.out.println(Arrays.toString(names));

        int[] nums = new int[7]; // highest index 6
        // nums[7]=10; // Array' size is fixed
        System.out.println(Arrays.toString(nums));

        char[] characters = {'a', 'b', 'c', 'd'};
        String str1 = Arrays.toString(characters);
        System.out.println(str1);

        int[] scores = {10, 9, 8, 7, 6, 5, 4, 3};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        String [] chars = "ABCD".split("");
        System.out.println(Arrays.toString(chars));

        char [] chars2 = "Vlad".toCharArray();
        System.out.println(chars2);


    }

}