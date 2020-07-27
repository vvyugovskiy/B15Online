package Cybertek.day63_map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBBBACCRDDD";

        // Get the frequency and store into map <Characters, Integer>

        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int x = 0; x < str.length(); x++) {
            char currentChar = str.charAt(x);
            // IF THIS IS A NEW CHARACTER WE ADD IT AS A KEY
            // AND A VALUE AS 1
            if (!charFreqMap.containsKey(currentChar)) {
                System.out.println("Enter for the first time "+currentChar);
                charFreqMap.put(currentChar, 1);
            // IF THIS IS AN EXISTING CHARACTER THAN WE ONLY
            // INCREASE THE VALUE BY 1
            }else {
                charFreqMap.replace(currentChar,charFreqMap.get(currentChar)+1);
            }
        }
        System.out.println(charFreqMap);
    }
}
