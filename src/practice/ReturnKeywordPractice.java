package practice;

import java.util.Scanner;

public class ReturnKeywordPractice {

    public static void main(String[] args) {

        int [] arr = {1999,122,2019, 1987, 1978,1964,3999, 2004};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(calculateAndReturnAge(arr[i], 2019));
        }
    }
    public static int calculateAndReturnAge(int birthYear, int currentYear) {

        if (birthYear >= 1900 && birthYear <= 2020) {
            return currentYear - birthYear;
        } else {
            return 0;
        }
    }
}
