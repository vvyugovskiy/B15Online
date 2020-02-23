package replit.$_151_200;
import java.util.*;
public class TwoDArraysChessBoard_171 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (char i = 0; i < 8 ; i++) {
            char a = 'a';
            for (int j = 0; j < 8 ; j++) {
                chessBoard[i][j] = "" +( i+1) + a;
                a++;
            }
        }

        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
