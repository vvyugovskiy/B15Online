package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {
        // this is passing the array object directly into the method
        arrayPrinter(new int[]{1, 6, 5, 3, 12, 3});

        // this is assigning the array object into a variable
        // and then pass it into the method
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        arrayPrinter(scores);
        printMaxOfIntArray(new int[]{1, 2, 3, 4, 5, 6, 78});
        printMinOfIntArray(new int[]{6, -17, 19, 90, 56});
        printSunOfIntArray(new int[]{1, 2, 3, 4, 5, 17, 89});

        compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1, names2);
    }
    //array printer
    //create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items: -->> all the items here
    public static void arrayPrinter(int[] nums) {

        System.out.println("arrays has items : " + Arrays.toString(nums));
    }
    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray(int[] nums) {
        int max = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > max) {
                max = nums[x];
            }
        }
        System.out.println(max);
    }
    public static void printMinOfIntArray(int[] nums) {
        int min = nums[0];
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] < min) {
                min = nums[x];
            }
        }
        System.out.println(min);
    }
    public static void printSunOfIntArray(int[] nums) {
        int sum = nums[0];
        for (int x = 0; x < nums.length; x++) {
            sum += nums[x];
        }
        System.out.println(sum);
    }
    public static void compare2arraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }
    }
        // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

}