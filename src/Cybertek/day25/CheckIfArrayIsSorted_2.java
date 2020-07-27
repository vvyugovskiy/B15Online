package Cybertek.day25;

import java.util.Arrays;

public class CheckIfArrayIsSorted_2 {
    public static void main(String[] args) {
        //int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Nums : " + Arrays.toString(nums));
        boolean isSortedAlready = true;
        for (int x = 0; x < nums.length - 1; x++) {
            // pick first and compare with second untill there is no items
            System.out.println("is " + nums[x] + " less than " + nums[x + 1] + " ? " + (nums[x] < nums[x + 1]));
            if (!(nums[x] < nums[x + 1])) {
                System.out.println("Array is not sorted,No POINT to check the rest");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("Is sorted Already " + isSortedAlready);
    }
}
