package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] allWords = sentence.split(" ");
        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));
        System.out.println("How many words in a Sentence ? "+allWords.length);
        // printing out last WORD
        System.out.println("LAST WORD : "+allWords[allWords.length-1]);

        String sentence2 = "Everything is Awesome!!!";
        // split by letter e
        String [] splitByE = sentence2.split("is");
        System.out.println("splitByE = " + Arrays.toString(splitByE));

        for (String eachPieces : splitByE) {
            System.out.println("eachPieces = " +"<"+ eachPieces+">");;
        }
    }
}
