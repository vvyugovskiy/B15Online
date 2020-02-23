package replit.$_151_200;

import java.util.*;

public class Methods14PrintUniqueNumbers_159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
// WAY#1:
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] != nums[i + 1])
//                System.out.println(nums[i]);
//            else
//                i++;
//        }
//        if (nums[nums.length - 2] != nums[nums.length - 1])
//            System.out.println(nums[nums.length - 1]);
//    }
    // WAY#2:
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
//                    if (count > 1) {
//                        break;
//                    }
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
