package replit.$_151_200;

import java.util.*;

public class MethodsWithString2Unique_179 {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("mama"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.substring(i,i+1))){
                unique+=str.substring(i,i+1);
            }
        }
        return unique;
    }
}
