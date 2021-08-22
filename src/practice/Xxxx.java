package practice;

public class Xxxx {

    public static void main(String[] args) {
        System.out.println(returnMax(new int[]{2, 89, 3, -5, 6, 45, 56, 0, -14}));
    }

    public static int returnMax(int[] nums) {
        int max = nums[0];
        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}