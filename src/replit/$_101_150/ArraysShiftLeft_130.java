package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysShiftLeft_130 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
//        int[] numsShifted = new int[size];
//                for (int i = 0; i < size; i++) {
//                    if (i != size-1) {
//                        numsShifted[i] = nums[i+1];
//                    }
//                    if (i == size-1) {
//                        numsShifted[i] = nums[0];
//            }
//        }
//        System.out.println(Arrays.toString(numsShifted));
//        String output = "";
//        for (int i = 0; i < size-1 ; i++) {
//            output += nums[i+1] + ", ";
//        }
//        //System.out.println(output + nums[0]);
//        String [] outputArr = {output+nums[0]};
//        System.out.println(Arrays.toString(outputArr));
        int temp=nums[0];

        for (int i=0;i<size-1;i++){
            nums[i]=nums[i+1];
        }
        nums[size-1]=temp;

        System.out.println(Arrays.toString(nums));
    }
}