package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;

public class A_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        // SORT IN ASCENDING ORDER
//        for (int i = 0; i < arr.length; i++) {  // OUTER LOOP
//            for (int j = 0; j < arr.length - 1 - i; j++) {  // INNER LOOP
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j + 1);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
