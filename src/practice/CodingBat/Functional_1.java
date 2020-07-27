package practice.CodingBat;

import java.util.*;

public class Functional_1 {

    public static void main(String[] args) {

        System.out.println(doubling(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
        System.out.println(square(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
        System.out.println(addStar(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copies3(Arrays.asList("hello", "there")));
        System.out.println(moreY(Arrays.asList("a", "b", "c")));
        System.out.println(math1(Arrays.asList(1, 2, 3)));
        System.out.println(rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        System.out.println(lower(Arrays.asList("AAA", "BBB", "ccc")));
        System.out.println(noX(Arrays.asList("xxax", "xbxbx", "xxcx")));


    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }
    //---------------------------------------------------------------------------------------------------------------

    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    //---------------------------------------------------------------------------------------------------------------
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
    //---------------------------------------------------------------------------------------------------------------

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }
    //---------------------------------------------------------------------------------------------------------------
    public static List<String> noX(List<String> strings) {
        strings.replaceAll (n -> n.replaceAll("x",""));
        return strings;
    }
}
