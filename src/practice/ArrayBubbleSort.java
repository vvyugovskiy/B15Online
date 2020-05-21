package practice;

import java.util.Arrays;

public class ArrayBubbleSort {

    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        //        Arrays.sort(arr);

        System.out.println("Arrays.sort :: " + Arrays.toString(arr));

        // bubble sort

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort : " + Arrays.toString(arr));

        //-----------------------------------------------------------------------------------------

        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums = " + Arrays.toString(nums));
        boolean isSortedAlready = true;
        for (int x = 0; x < nums.length - 1; x++) {

            if (!(nums[x] < nums[x + 1])) {
                System.out.println("ARRAY IS NOT SORTED , NO POINT CHECKING THE REST");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }

}
