package replit.$_101_150;

import java.util.Scanner;

public class ArraysFindMax_115 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and find the max number.
        // Given an array num, get the max number in nums and print out to console.
        //TODO: Write your code below .
        int max = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            }

        }
        System.out.println(max);
    }
}
