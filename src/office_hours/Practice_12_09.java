package office_hours;

import java.util.Arrays;

public class Practice_12_09 {
    public static void main(String[] args) {

        int num = 9;
        num = 15;
        System.out.println(num);
        // 1ST way to create an Array
        int[] nums = new int[4];
        nums[0] = 5;
        // i assign value of bun variable to 2 member of array
        nums[1] = num;
        nums[2] = 25;
        nums[3] = 22;
        // print info about arrays
        // toString - human readable info about array as a String
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in an array" + nums.length);
        // when we want to get some value from array, we provide index
        // 1 it's an index of seconds value in array
        System.out.println(nums[1]);
        // if i want to get last value from array
        System.out.println("Last vakue in array" + nums[nums.length - 1]);
        // How to find middle value
        System.out.println("Middle value is : " + nums[nums.length / 2]);

// 2ND way to create an Array

        int[] newNums = new int[]{-45, 1, 3, 456, 4, 5, 7};
        System.out.println(newNums[newNums.length / 2]);
        // how to find biggest number?
        // lets imagine if 1St number is the biggest
        int max = newNums[0];
        int secondMax = max;
        int min= newNums[0];

        for (int index = 0; index < newNums.length; index++) {
            // if any value is greater than current max
            if (newNums[index] > max) {
                // change max variable to this value
                max = newNums[index];
            }
            // same as previous but we excluding max number
            if (newNums[index] > secondMax && newNums[index] != max) {
                // change max variable to this value
                secondMax = newNums[index];
            }
            //how to find minimum value
            if (newNums[index]<min){
                min=newNums[index];
            }
        }
            System.out.println("Max is: " + max);
            System.out.println("Second Max: " + secondMax);
        System.out.println("Minimum is: "+min);
    }
}