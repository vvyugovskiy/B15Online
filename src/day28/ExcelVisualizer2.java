package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {


        int[][] myExcel = {    // this is the beginning of the 2D array object
                {10, 27, 88, 99}, // first 1D array
                {87, 100},  // second 1D array
                {90, 45, 65}  // third 1D array
        };  // this is the end of the 2D array object
        System.out.println(Arrays.deepToString(myExcel));
        // what does deepToString does:
        // takes a multiple Array and turns it into a String with all items
        // what external data do we provide
        // the multiiD array object or the multiD array variable
        // what do i get out of it
        // ==>> String representation of multiiD array object

        for (int[] eachRow : myExcel) {
            for (int eachCell :
                    eachRow) {
                System.out.print(eachCell+" ");
            }
            System.out.println();
        }
    }
}
