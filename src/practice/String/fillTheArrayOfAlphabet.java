package practice.String;

import java.util.Arrays;

public class fillTheArrayOfAlphabet {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(alphabetArray("vladislav")));
    }
    public static int[] alphabetArray(String str) {
        int[] char_counts = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            char_counts[c-'a']++;
        }
        return char_counts;
    }
}
