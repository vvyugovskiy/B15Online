package practice.CodingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functional_2 {
    public static void main(String[] args) {

        System.out.println(noNeg(new ArrayList<>(Arrays.asList(-3, -3, 3, 3))));
        System.out.println(no9(new ArrayList<>(Arrays.asList(45, 99, 90, 28, 13, 999, 0))));
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(-16, 2, 15, 3, 16, 25))));

        System.out.println(noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
        System.out.println(noLong(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))));
        System.out.println(no34(new ArrayList<>(Arrays.asList("dddd", "ddd", "xxxxxxx"))));

        System.out.println(noYY(new ArrayList<>(Arrays.asList("yyx", "y", "zzz"))));
        System.out.println(two2(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11))));
        System.out.println(square56(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))));

    }

    //-----------------------------------------------------------------------------------------------------------------
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n <= 19);
        return nums;
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static List<String> noZ(List<String> strings) {

        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
    //-----------------------------------------------------------------------------------------------------------------

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }
    //-----------------------------------------------------------------------------------------------------------------

    public static List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }

    //-----------------------------------------------------------------------------------------------------------------
    public static List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }
    //-----------------------------------------------------------------------------------------------------------------

    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
    //-----------------------------------------------------------------------------------------------------------------

    public static List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n * n + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}
