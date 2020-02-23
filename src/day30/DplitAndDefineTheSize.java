package day30;

import java.util.Arrays;

public class DplitAndDefineTheSize {
    public static void main(String[] args) {

// SPLIT method has 2 versions:

        String sentence  = "I love Java Java Java";

        String [] wordsArray1 = sentence.split(" ",1);
        String [] wordsArray2 = sentence.split(" ",2);
        String [] wordsArray3 = sentence.split(" ",3);
        String [] wordsArray4 = sentence.split(" ",4);
        String [] wordsArray5 = sentence.split(" ",5);
        String [] wordsArray6 = sentence.split(" ",6);

        System.out.println("wordsArray1"+Arrays.toString(wordsArray1));
        System.out.println("wordsArray2"+Arrays.toString(wordsArray2));
        System.out.println("wordsArray3"+Arrays.toString(wordsArray3));
        System.out.println("wordsArray4"+Arrays.toString(wordsArray4));
        System.out.println("wordsArray5"+Arrays.toString(wordsArray5));
        System.out.println("wordsArray6"+Arrays.toString(wordsArray6));

        System.out.println("wordsArray = " + wordsArray6.length);
    }
}
