package Cybertek.day38;

import java.util.*;

public class ReversingAList {
    public static void main(String[] args) {

        // reversing an ArrayList Object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,100,700,400,500));
        // 200, 100, 700, 400,500
        // after reversing
        //500, 400, 700, 100,200
        // after sorting in reversed order
        // 700, 500, 400,200,100
        Collections.reverse(nums1);
        System.out.println("nums1 after reversing = "+nums1);
        Collections.sort(nums1, Comparator.reverseOrder());
        System.out.println("nums1 after sorting = "+nums1);


    }
}
