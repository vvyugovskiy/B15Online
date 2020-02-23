package day25;

import java.util.Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        //int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums = {1,2,3,4,5,6};
        System.out.println("Nums : "+Arrays.toString(nums));
        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        // i want to copy the content of nums array into the new array

        int[] numsCopy = new int[numsItemCount];
//        numsCopy[0] = nums[0];  // copying one by one from original Array
//        numsCopy[1] = nums[1];
//        numsCopy[2] = nums[2];
//        numsCopy[3] = nums[3];
//        numsCopy[4] = nums[4];
//        numsCopy[5] = nums[5];

        for (int x = 0; x < numsItemCount; x++) {
            numsCopy[x] = nums[x];
        }
        System.out.println("Before Sort nums copy = " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After Sort = "+Arrays.toString(numsCopy));
        //
        //
        if (Arrays.equals(nums,numsCopy)){
            System.out.println("This Arrays SORTED");
        }else {
            System.out.println("This Arrays NOT SORTED");
        }



    }
}
