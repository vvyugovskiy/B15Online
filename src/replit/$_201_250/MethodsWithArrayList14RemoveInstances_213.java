package replit.$_201_250;

import java.util.*;

public class MethodsWithArrayList14RemoveInstances_213 {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i) == n) {
                r.remove(r.get(i));
                i--; // go back one index to check again after shifting
            }
        }
        return r;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }
}
