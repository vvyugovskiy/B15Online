package Cybertek.day38;

import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        // how do we copy everything from array into ArrayList Object

        Integer [] nums = {1,4,5,7,8,5,3,2,19};
        List<Integer> numsLst = Arrays.asList(nums);
        // turn this ArrayList into int array
        Integer[]numsArr = numsLst.toArray(new Integer[9]);
    }
}
