package replit.$_101_150;

import java.util.Scanner;

public class ArraysCountEvens_121 {
    public static void main(String[] args) {

       // Given an array nums, calculate count of even numbers in nums (not their values!) and print out to console.
        // COUNT of EVEN numbers Appearances!
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
        int count=0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x]%2==0){
                // System.out.println(nums[x]);
                count++;
            }
        }
        System.out.println(count);
    }
}
