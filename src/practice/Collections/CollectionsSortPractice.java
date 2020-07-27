package practice.Collections;

import java.util.*;


public class CollectionsSortPractice {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, -9, 12, 99, -22, 0, 1));

        Collections.sort(array);  // NATURAL ORDER

        array.sort(Comparator.reverseOrder());  // DESCENDING ORDER

        System.out.println(array);
    }
}
