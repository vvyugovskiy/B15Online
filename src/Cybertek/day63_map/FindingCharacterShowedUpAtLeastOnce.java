package Cybertek.day63_map;

import java.util.*;

public class FindingCharacterShowedUpAtLeastOnce {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique correctors is on the above sentence


        // First chose a data structure that automatically remover duplicates
        // (create a HashSet object with type Character)
        // iterate over each character in above String
        // the n add it to the HashSet so it can remove the duplicate for us

        // ONE WAY TO DO IT

        Set<Character> charSet = new TreeSet<>();
//---------------------------------------------------------------------------------------
        // TreeSet : NO DUPLICATES, SORTS
        // HashSet : NO DUPLICATES, DOES NOT KEEP INSERTION ORDER, DOESN'T SORT
        // LinkedHashSet : NO DUPLICATES, KEEPS INSERTION ORDER
//---------------------------------------------------------------------------------------
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }

        System.out.println("Characters count in a str : " + str.length());
        System.out.println("Characters that Unique count : " + charSet.size());
        System.out.println(charSet);

        // Using for Loop
        for (Character each : charSet) {
            System.out.print(/*"each = " + */"|"+each+"|");
        }
    }
}
