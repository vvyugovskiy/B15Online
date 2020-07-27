package Cybertek.day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess my favorite number");
        int myFavoriteNumber=scan.nextInt();
        if (myFavoriteNumber == 300){
            System.out.println("BINGO!!!");

        } else {
            System.out.println("Try Again Later");
        }



       /* 2. Create a var. to guess your favorite number
        var. = myFavoriteNumber as int
        As user to guess your favorite number
        If guest right 300 print BINGO
        it not 300 print Try Again Later
         */



    }

}
