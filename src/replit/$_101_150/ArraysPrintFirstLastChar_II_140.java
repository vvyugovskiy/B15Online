package replit.$_101_150;

import java.util.*;

public class ArraysPrintFirstLastChar_II_140 {

    public static void main(String[] args) {

//        Given a String array words, iterate through each word
//        and print first and last letter of each element in the format below.
//
//        Example:
//        words → ["hello", "why", "by", "apple" , "note"]
//        print → [ho, wy, by, ae, ne]

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        //TODO: Write your code below
//    way#1     // by changing a Current String Array
        for (int i = 0; i < words.length; i++) {
            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);

        }
        System.out.println(Arrays.toString(words));

//    way#2        // by creating a NEW String Array
//        String [] eachShort = new String [words.length]; // fixing the size of a new Arrays equals words size
//        for (int i = 0; i < words.length; i++) {
//            eachShort[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
//        }
//        System.out.println(Arrays.toString(eachShort));
    }
}
