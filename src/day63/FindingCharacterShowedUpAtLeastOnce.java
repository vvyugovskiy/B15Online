package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindingCharacterShowedUpAtLeastOnce {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique correctors is on the above sentence

        Set<Character> chr = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            chr.add(str.charAt(i));

        }
        System.out.println("Characters count in a text : " + str.length());
        System.out.println(chr);
        System.out.println("Characters that Unique count : " + chr.size());

        // Using for Loop
        for (Character each : chr) {
            System.out.println("each = " + each);
        }
    }
}
