package practice.String;

import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.Comparator;

public class StringCustomSorting {

    // Sort a mixed string(containing uppercase and lowercase characters)
    public static String sortString(String givenString) {

        // convert input String to Character array
        Character charArray[] = new Character[givenString.length()];
        for (int i = 0; i < givenString.length(); i++) {
            charArray[i] = givenString.charAt(i);
        }

        // Sort, ignoring case during sorting
        Arrays.sort(charArray, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                // ignoring case
                return Character.compare(Character.toLowerCase(o1), Character.toLowerCase(o2));
            }
        });

        // using StringBuilder to convert Character array to String
        StringBuilder sb = new StringBuilder(charArray.length);
        for (Character c : charArray)
            sb.append(c.charValue());
        return sb.toString();

    }

    public static void main(String[] args) {

        String givenString = "Vladislav Vladimirovich";
        String sortString = sortString(givenString);
        System.out.println("sortString = " + sortString);
    }

}
