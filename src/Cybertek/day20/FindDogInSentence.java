package Cybertek.day20;

public class FindDogInSentence {
    public static void main(String[] args) {

        // find out a location a dog in sentence
        // approach is
        // going through the sentence 3 char. at a time
        // then if 3 char. happen to be a dog, we print out the index

        //            01234567890123456789012345678901234567890123
        String msg = "I like Dog, Dogs are cure, Dogs are friendly";

        for (int k = 0; k <= msg.length()-3; k ++) {

            String current3chars = msg.substring(k, k + 3);
            if (current3chars.equals("Dog")) {
                System.out.println("BINGO!!"+k);

            }
        }
    }
}
