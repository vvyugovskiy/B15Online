package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(getListFrom1ToFinalNumber(7));
        System.out.println(getListFrom1ToFinalNumber(2));
        System.out.println(getListFrom1ToFinalNumber(20));

        List<Integer> myList = getListFrom1ToFinalNumber(25);
        System.out.println("My list : "+myList);
    }
//      This method will return a List of Integer that containing numbers
//     starting from 1 till finalNumber
    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber) {
        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
        //System.out.println("nums = " + nums);
        return nums;
    }
}
