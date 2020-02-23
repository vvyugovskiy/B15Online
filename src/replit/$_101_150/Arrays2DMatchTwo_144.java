package replit.$_101_150;

import java.util.*;

public class Arrays2DMatchTwo_144 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rwos

        //your code here
// Way #1:
        int matches = 0;
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 2; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    matches++;
//  Way#2:
//        int matches = 0;
//        for (int[] raws : arr) {
//            for (int i = 0; i < raws.length - 1; i++) {
//                if (raws[i] == raws[i + 1]) {
//                    matches++;
//
//  Way#3:
//        int matches = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length-1; j++) {
//                if(arr[i][j]==arr[i][j+1]){
//                    matches++;
                }
            }
        }
        System.out.print("matches: " + matches);
    }//end main
}
