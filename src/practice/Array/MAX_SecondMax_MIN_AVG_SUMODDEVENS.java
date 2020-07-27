package practice.Array;

public class MAX_SecondMax_MIN_AVG_SUMODDEVENS {

    public static void findSecondLargest(int[] arr, int array_size) {

        int max, secondMax;

        if (array_size < 2) {
            System.out.println("Size of array should be more than 0");
        } else {
            max = secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < array_size; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else {
                    if (arr[i] > secondMax && arr[i] < max) {
                        secondMax = arr[i];
                    }
                }
            }
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element");
            } else {
                System.out.println("Second Max :: " + secondMax);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 12, -6, 0, 12, 99, 55, -17, 67};
        int sumEvan = 0, sumOdd = 0, sum = 0;
        int max = arr[0], min = arr[0];
        int secondMax = arr[0];

        for (int i : arr) {
            sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max; // first check for second largest
                max = arr[i]; // finding a max number
            } else if (arr[i] < min) {
                min = arr[i]; // finding a min number
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; // second check for second largest
            }
            if (arr[i] % 2 == 0) {
                sumEvan += arr[i]; // summarizing even numbers
            } else if (arr[i] % 2 != 0) {
                sumOdd += arr[i]; // summarizing odd numbers
            }
        }
        System.out.println("average :: " + max / arr.length);
        System.out.println("max :: " + max);
        System.out.println("min :: " + min);
        System.out.println("sumEvan :: " + sumEvan);
        System.out.println("sumOdd :: " + sumOdd);
        System.out.println("sum :: " + sum);
        System.out.println("Second largest :: " + secondMax);

        int[] arr1 = {5, 12, -6, 0, 12, 99, 55, -17, 67};
        int s = arr1.length;
        findSecondLargest(arr1, s);
    }

}


