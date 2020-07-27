package Cybertek.day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        char[] eachChars = sentence.toCharArray();
        String[] eachWords = sentence.split(" ");
        int[] returnArr =returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(returnArr));
    }

    public static int[] returnBoysVSGirlsResult() {
        int[] boysGirlsCount = {56, 52};
        return boysGirlsCount;
    }
}
