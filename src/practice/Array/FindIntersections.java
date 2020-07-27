package practice.Array;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersections {

    public static void main(String[] args) {

// Using Iterative Method
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        HashSet<String> hs = new HashSet<>();
        for (String s : s1) {
            for (String value : s2) {
                if (s.equals(value)) {
                    hs.add(s);
                }
            }
        }
        System.out.println(hs);

// Using retainAll() Method
        Integer[] i1 = {1, 2, 3, 4, 5, 4};
        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        HashSet<Integer> h1 = new HashSet<>(Arrays.asList(i1));
        HashSet<Integer> h2 = new HashSet<>(Arrays.asList(i2));

        h1.retainAll(h2);
        System.out.println(h1);

    }
}
