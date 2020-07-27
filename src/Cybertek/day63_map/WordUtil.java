package Cybertek.day63_map;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        //System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));
        // WE CAN STORE THE RESULT ALSO

        Map<String,Integer> theFrequency = getFrequencyMap(str);
        System.out.println("theFrequency = " + theFrequency);

    }

    // WHY IS IT STATIC? SO I CAN CALL IT DIRECTLY IN MAIN METHOD TO TEST
    // CAN I NOT MAKE IT STATIC? YES. BUT WILL HAVE TO CREATE OBJECT THEN CALL IT
    // CAN IT BE VOID ? YES YOU CAN VOID BUT REQUIREMENT IS getFrequencyMap AND RETURN IT TO THE CALLER

    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
        String[] allWords = str.split(" ");
        for (String word : allWords) {
            if (!wordFreqMap.containsKey(word)) {
                System.out.println("Entering Key for the first time : " + word);
                wordFreqMap.put(word, 1);
            } else {
                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;
    }
}
