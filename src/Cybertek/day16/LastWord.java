package Cybertek.day16;

public class LastWord {
    public static void main(String[] args) {

        String sentence = "I Understand Java";
        String lastWord;

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("Last Word = " + lastWord);

    }
}
