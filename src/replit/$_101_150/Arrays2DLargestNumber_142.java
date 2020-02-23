package replit.$_101_150;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2DLargestNumber_142 {

    public static void main(String[] args) {

       // Given a 2d array of ints, find the biggest number(int) in the array and print it.

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
//    Way#1
        int max = arr[0][0];
        for (int i = 0; i <= rows-1; i++) {
            for (int j = 010; j <= cols-1; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

//    Way#2  // For Each loop
//        max=arr[0][0];
//        for (int[] rowsky: arr){
//            for (int columnsky: rowsky) {
//                if (columnsky>max){
//                    max=columnsky;
//                }
//            }
//        }
//        System.out.println(max);

    }//end main
}
