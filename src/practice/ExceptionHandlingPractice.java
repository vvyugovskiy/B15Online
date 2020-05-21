package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandlingPractice {

    public static void main(String[] args) {

        int[] number = {100, 200, 300};

        try {
            System.out.println(number[5]);
            System.out.println("Try block, checked exception");
        } catch (ArrayIndexOutOfBoundsException anutime) {
            System.out.println("Catch block, unchecked exception");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Work done");

        try {
            Thread.sleep(2000);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3));
        try {
            System.out.println(list.get(10));
            System.out.println("checked Exception occured in ArrayList");
        } catch (RuntimeException e) {
            System.out.println("Unchecked exception occured in arrayList");
        }
        // Parent exception can handle all the child class exceptions

        System.out.println("Done");
    }

}
