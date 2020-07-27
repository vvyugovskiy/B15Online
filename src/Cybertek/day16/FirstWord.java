package Cybertek.day16;

public class FirstWord {
    public static void main(String[] args) {

        String sentence = "People Understand Java";
        int firstSpaceIndex = sentence.indexOf(" ");
        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
    }
}
