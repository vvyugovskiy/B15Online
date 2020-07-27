package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;

public class D_ShellSort {

    public static void main(String[] args) {


        /*

        Shell sort -> Goal is to reduce the amount of shifting required,
        less than using Insertion Sort
        In-Place algorithm
        Time Complexity is based on the Gap(Worst is Quadratic)
        Unstable algorithm

         */

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        // improved Insertion Sort
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
