package replit.$_101_150;

import java.util.Scanner;

public class Arrays_findNon_Dublicate_122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        // TODO: Write your code below

        // FOR EACH LOOP WAY

//        int count = 0;
//        for (int i : nums) {
//            for (int j : nums) {
//                if (i == j) {
//                    count++;
//                }
//            }
//            if (count < 2) {
//                System.out.println(i);
//            }
//            count = 0;
//        }

//        // FOR LOOP WAY

        int count=0;
        for (int x =0;x<nums.length; x++){
            for (int j = 0; j<nums.length; j++){
                if (nums[x]==nums[j]){
                    count++;
                }
            }
            if (count<2){
                System.out.println(nums[x]);
            }
            count=0;
        }
    }
}
