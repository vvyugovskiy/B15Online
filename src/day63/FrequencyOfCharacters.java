package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBBBACCRDDD";

        // Get the frequency and store into map <Characters, Integer>

        Map<Character, Integer> charFreq = new HashMap<>();
        for (int x = 0; x < str.length(); x++) {
            char currentChar = str.charAt(x);
            if (!charFreq.containsKey(currentChar)) {
                System.out.println("Enter for the first time "+currentChar);
                charFreq.put(currentChar, 1);
            }else {
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);
            }
        }
        System.out.println(charFreq);
    }
}
