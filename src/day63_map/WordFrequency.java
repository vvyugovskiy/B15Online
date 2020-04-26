package day63_map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

        String[] allWords = str.split(" ");
        System.out.println("Words.length = " + allWords.length);

        // we want to solve this using the Map
        // because Map only can have unique key, so we can use it for unique words
        // first create Map object HashMap implementation

        // Loop through the word array

        // Check if we already have the word in the key or not
        // If we do not have the key, than Enter it for the first time
        // so the count will be 1, add using put method
        // else it means we already have it in the key
        // so we get existing count using that key
        // and replace the old count value with new count

        Map<String, Integer> wordFreMap = new HashMap<>();
        for (String currentWord : allWords) {
            // if (!wordFreMap.containsKey(currentWord)){
            if (wordFreMap.containsKey(currentWord) == false) {
                System.out.println("Entering the key for the first time : " + currentWord);
                wordFreMap.put(currentWord, 1);
            } else {
                // wordFreMap.replace(currentWord, wordFreMap.get(currentWord) + 1);
                int newCount = wordFreMap.get(currentWord)+1;
                wordFreMap.replace(currentWord,newCount);
            }
        }

        System.out.println("wordFreMap = " + wordFreMap);
    }
}
