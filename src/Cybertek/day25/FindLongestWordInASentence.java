package Cybertek.day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {

        String sentence = "We are trying to find a longest word";
        String [] allWords = sentence.split(" ");
        System.out.println("allWords = "+ Arrays.toString(allWords));

        String longestWord="";
        int maxChar=0;
        for (String currentWord :allWords) {
            if (currentWord.length()>longestWord.length()){
                longestWord=currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
