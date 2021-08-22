package practice.String;

import java.util.HashMap;

public class firstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingCharacterHashMap("Vladislav Vyugovskiy"));
        System.out.println(firstNonRepeatingCharacterArray("Vladislav Vyugovskiy"));
        System.out.println(firstNonRepeatingCharIndexOf("Vladislav Vyugovskiy"));
    }

    public static char firstNonRepeatingCharacterHashMap(String s) {
        HashMap<Character, Integer> char_counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char_counts.put(c, char_counts.getOrDefault(c, 0) + 1);
        }
        // HashMap put and get time complexity is n(1) - constant;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (char_counts.get(c) == 1) return c;
        }
        return '_';
    }

    public static char firstNonRepeatingCharIndexOf(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return '_';
    }

    public static char firstNonRepeatingCharacterArray(String str) {
        int[] count_char = new int[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                count_char[c - 'a']++;
            }
        }
        for (char c : str.toCharArray()) {
            if (count_char[c - 'a'] == 1) return c;
        }
        return '_';
    }

    public static char firstNonRepeatingCharacterNestedLoop(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean seenDuplicate = false;
            for (int j = 0; j < s.length(); i++) {
                if (s.charAt(i) == s.charAt(j) && (i != j)) {
                    seenDuplicate = true;
                    break;
                }
            }
            if (!seenDuplicate) return s.charAt(i);
        }
        return '_';
    }
}
