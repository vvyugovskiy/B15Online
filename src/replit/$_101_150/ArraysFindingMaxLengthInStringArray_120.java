package replit.$_101_150;

import java.util.Scanner;

public class ArraysFindingMaxLengthInStringArray_120 {
    public static void main(String[] args) {
//        Given the array words, it will print the word with the largest length.
//        Assume that there are no 2 words with longest length
//        Example:
//        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//        prints jaaaaavvaaaaaaaaaa

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }
        //write your code below
        String longest = "";
        for (String eachWord : words){
            if (eachWord.length()>longest.length()){
                longest=eachWord;
            }
        }
        System.out.println(longest);
    }
}
