package practice.DataStructuresAndAlgorithms.A_SortAlgorithms;
import java.util.Arrays;
public class J_SortingArrays {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Arrays.parallelSort(intArray);
        for (int i=0; i <intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

}
