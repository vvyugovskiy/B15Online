package replit.$_051_100;

import java.util.Scanner;

public class MiddleOne_064 {
    public static void main(String[] args) {

//        You have a word, do the following:
//        1. When word has odd number of characters and:
//        - 3 or more characters, print middle letter
//        oak ==> a
//        javav ==> v
//                - Single character, print that character 3 times
//      # ==> ###
//        q ==> qqq
//        2. When word has even number of characters and:
//        - 4 or more characters, print middle 2
//        java ==> av
//        apples ==> pl
//     #$%^&* ==> %^
//        - 2 characters, print those 2 characters twice
//        @@ ==>@@@@
//                $$ ==>$$$$
//        hi ==> hihi

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int midleIndex = (word.length() / 2);
        int midleIndex1 = (word.length() / 2) - 1;
        int midIntPlusOne = (word.length() / 2) + 1;
        int midIntPlusOne1 = (word.length() / 2) + 1;
        // System.out.println(word.length());
        if (word.length() >= 3 && word.length() % 2 != 0) {
            System.out.println(word.substring(midleIndex, midIntPlusOne));
        } else if (word.length() == 1) {
            System.out.print(word + word + word);
        }else if (word.length() > 2 && word.length() % 2 == 0) {
            System.out.println(word.substring(midleIndex1, midIntPlusOne1));
        } else if (word.length() == 2) {
            System.out.print(word + word);
        }
    }
}
