package practice.Interview;

import java.util.Arrays;

public class Task00_CheckIfTwoStringsAreAnagram {

    public static boolean areAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);


        if (Arrays.equals(str1, str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(areAnagram("listen", "silent"));
        System.out.println(areAnagram("triangle", "integral"));

    }
}
