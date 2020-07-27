package Cybertek.day16;

public class SecondWordGetter {
    public static void main(String[] args) {
        
        // given a sentence with 3 words
        // get the second word
        
        // getting location of space .indexOf
        //getting string inside another string by beginning and ending index
        // remind me of substring
        
        String sentence = "I Understand Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(1+1,6));
        secondWord = sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);
        
    }
}
