package practice.mentors.mykyta;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {

//        nums = 1,4,2,34,8
//        2,4,34,8
//        4,34,8               original: 2,4,1,34,8
//        8,34               soreted:  1,2,4,8,34
//        34
//        2. Swap elements.
//        create temporary veriable temp. Same type as our array. temp=nums1
//        nums1=nums2
//        nums2=temp
//        Step1. Find local minumum for each array.

        int [] nums ={2,4,1,34,8};
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                System.out.println(Arrays.toString(nums));
            }
        }
    }
}
