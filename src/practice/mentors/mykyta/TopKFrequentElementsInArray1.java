package practice.mentors.mykyta;

import java.util.*;

public class TopKFrequentElementsInArray1 {

    /**
     * Given a non-empty array of integers, return the k most frequent elements.
     * <p>
     * Example 1:
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * Example 2:
     * Input: nums = [1], k = 1
     * Output: [1]
     */

    public static int[] topKFromElements(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        // MUSTKNOW Very usable convenient method
        for (int each : nums) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((i, j) -> map.get(j) - map.get(i));
        int count = 0;
//        for (Integer each : list) {
//            if (count >= k) {
//                break;
//            } else {
//                result[count] = each;
//            }
//            count++;
        for (int i = 0; i < k; i++) {

            result[i]=list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

//        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
//        int k = 1;
        System.out.println(Arrays.toString(topKFromElements(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3}, 9)));
    }
}
