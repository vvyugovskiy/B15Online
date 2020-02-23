package replit.$_201_250;

import java.util.Arrays;

public class MethodsWithString15Anagram_204 {
    public static boolean isAnagram(String word1, String word2) {

//        word1.toLowerCase().replace(" ","");
//        word2.toLowerCase().replace(" ","");
        char [] newWord1 = word1.replace(" ","").toLowerCase().toCharArray();
        char [] newWord2 = word2.replace(" ","").toLowerCase().toCharArray();
        Arrays.sort(newWord1);
        Arrays.sort(newWord2);
        return newWord1.equals(newWord2);
    }

}
