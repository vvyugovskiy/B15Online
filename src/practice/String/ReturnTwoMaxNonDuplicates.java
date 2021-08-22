package practice.String;

import java.util.*;

public class ReturnTwoMaxNonDuplicates {

    public static void main(String[] args) {
//        twoMaxValues(new int[]{12, 20, 30, 15, 30});
        System.out.println(Arrays.toString(twoLargest(new int[]{12, 20, 30, 15, 30, 45, 67, 67, 30})));
        System.out.println(Arrays.toString(twoLargest(new int[]{12, 9})));

    }

    public static void twoMaxValues(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int in = arr[i];
            map.put(in, map.getOrDefault(in, 0) + 1);
        }
        System.out.println(map);
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }
        Collections.sort(result);
        System.out.println(result.get(result.size() - 1) + " " + result.get(result.size() - 2));
    }

    public static int[] twoLargest(int values[]) {
        int largestA = Integer.MIN_VALUE;
        int largestB = Integer.MIN_VALUE;
        if (values.length > 2) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] > largestA) {
                    largestB = largestA;
                    largestA = values[i];
                } else if (values[i] > largestB && values[i] != largestA) {
                    largestB = values[i];
                }
            }
            return new int[]{largestA, largestB};
        }
        return values;
    }
}
