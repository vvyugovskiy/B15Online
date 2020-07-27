package practice.Array;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {

    public static void main(String[] args) {

        int[] arr = {111, 333, 555, 777, 333, 444, 555};
        findDuplicates(arr);
        findDuplicatesUsingStreams(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int each : arr) {
            if (map.get(each) == null) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue()>1){
                System.out.println(entry.getKey() +" | " + entry.getValue() + " times");
            }
        }
    }

    public static void findDuplicatesUsingStreams (int [] arr){

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =  Arrays.stream(arr)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }
}
