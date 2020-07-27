package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;

public class C2_InsertionSortRecursive {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }
        insertionSort(input, numItems - 1);
        int newElement = input[numItems-1];
        int i;
        for (i = numItems-1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;
        System.out.println("Resul of call when numitems = " + numItems);
        for (i=0;i<input.length;i++){
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("------------------------");
    }
}
