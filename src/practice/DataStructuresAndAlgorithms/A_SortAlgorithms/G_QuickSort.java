package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;

public class G_QuickSort {

    /*
    -Divide and conquer algorithm
    -Recursive algorithm
    -Uses a pivot element to partition the array into two parts
    -Elements  < pivot to its left, elements > pivot to its right
    -Pivot will then be in its correct sorted position
    -Process is now repeated for the left array and right array

    -In-place algorithm
    -O(nlogn) - base 2
    -Unstable algorithm

     */
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray,0,intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void  quickSort (int [] input, int start, int end){
        if (end - start < 2){
            return;
        }
        int pivotIndex = partition (input, start, end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }
    public static int partition (int [] input, int start, int end){
        // this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >=pivot);
            if (i<j){
                input[i] = input[j];
            }
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j]=input[i];
            }
        }
        input[j]=pivot;
        return j;
    }
}
