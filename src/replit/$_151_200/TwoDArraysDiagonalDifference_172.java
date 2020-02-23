package replit.$_151_200;

import java.util.*;

public class TwoDArraysDiagonalDifference_172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];
            result -= matrix[i][(matrix.length - 1) - i];
        }
//        int sum1 = matrix[0][0]+matrix[1][1]+matrix[2][2];
//        int sum2 = matrix[0][2]+matrix[1][1]+matrix[2][0];
//        result = sum1-sum2;
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
