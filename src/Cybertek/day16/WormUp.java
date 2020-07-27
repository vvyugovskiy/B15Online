package Cybertek.day16;

import java.util.Scanner;

public class WormUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name a 4 letters word : ");
        String word1, word2;
        word1 = scan.next();
        System.out.println(word1.charAt(0) +" "+word1.charAt(1)+" "+word1.charAt(2)+" "+word1.charAt(3));
        //word2 = (word1.charAt(3) +" "+word1.charAt(2)+" "+word1.charAt(1)+" "+word1.charAt(0));
        word2 = (""+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0));
        System.out.println(word2);
    }
}
