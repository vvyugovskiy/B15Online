package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHas55_136 {
    public static void main(String[] args) {

        // Given an array of ints, print true if the array contains a 5 next to a 5
        // anywhere in the array. If no consecutive 5s or no 5s are detected in your code then print false.

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
//          Way #1:
//        boolean result = false;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (i!=nums.length-1 && nums[i]==5 && nums[i+1]==5){
//                result=true;
//                break;
//            }
//        }
//        System.out.println(result);
//          Way #2:
//        System.out.println(Arrays.toString(nums).contains("5,5"));
//          Way #3:
        boolean output=false;
        for (int i = 0; i <=nums.length-2 ; i++) {
            if(nums[i]==5 && nums[i+1]==5){
                output=true;
            }
        }
        System.out.println(output);
    }
}
