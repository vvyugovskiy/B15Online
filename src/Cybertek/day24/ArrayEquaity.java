package Cybertek.day24;

import java.util.Arrays;

public class ArrayEquaity {
    public static void main(String[] args) {

        int[] scores1 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores2 = {22, 45, 6, 37, 3, 6, 9};
        int[] scores3 = {2, 5, 6, 7, 3, 34, 6};
        int[] scores4 = {6, 5, 6, 7, 3, 2, 34};
        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        //Array equality -->>> Array.equals(firstArray,secondArray);
        boolean isS1S2Equals = Arrays.equals(scores1, scores2);
        System.out.println("isS1S2Equals = " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1, scores3);
        System.out.println("isS1S3Equals = " + isS1S3Equals);

        Arrays.sort(scores3);
        Arrays.sort(scores4);
        boolean isS3S4Equals = Arrays.equals(scores4, scores3);
        System.out.println("isS3S4Equals = " + isS3S4Equals);  // THE ORDER MATTER EVEN IF CONTAINS THE SAME NUMBERS!!!
        // BUT IF WE SORT IT RETURNS AS !!! TRUE !!!
    }
}
