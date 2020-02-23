package replit.$_201_250;

import java.util.*;

public class MethodsWithArrayList11TimesTwo_202 {
    public static void main(String[] args) {

    //Create a method that:
        //    is called timesTwo
        //    returns nothing
        //    takes in a single parameter - an ArrayList of Integers called nums
        //  This method should take the ArrayList parameter and multiply every value by two.
    }

    //create your method below
    public static void timesTwo(ArrayList<Integer> nums) {
        nums.replaceAll(integer -> integer*2);
//        for (int i = 0; i < nums.size(); i++) {
//            nums.set(i, nums.get(i) * 2);
//        }
    }
}
