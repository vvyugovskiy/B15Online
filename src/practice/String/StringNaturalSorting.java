package practice.String;

import java.util.Arrays;

public class StringNaturalSorting {

    public static String sortString(String givenString) {

        // creating an Array of chars from the String
        char charArray[] = givenString.toCharArray();
        // apply sort method
        Arrays.sort(charArray);
        // return sorted String
        return new String(charArray);
    }

    public static void main(String[] args) {

        String givenString = "Java, Java, Always Java";
        String sortedString = sortString(givenString);
        System.out.println("sortedString = " + sortedString);
    }
}
