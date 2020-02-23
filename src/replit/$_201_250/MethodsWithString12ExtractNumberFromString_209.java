package replit.$_201_250;
import java.util.*;
public class MethodsWithString12ExtractNumberFromString_209 {
    public static void main(String[] args) {

        String s = "aa2aa3";
       String newString = "";
        for (int c = 0; c < s.length(); c++) {
            if (Character.isDigit(s.charAt(c))){
                newString+=s.charAt(c);
            }
        }
        System.out.println(newString);
    }
}
