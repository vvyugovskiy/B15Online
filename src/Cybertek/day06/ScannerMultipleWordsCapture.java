package Cybertek.day06;

import java.util.Scanner;

public class ScannerMultipleWordsCapture {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name ? ");

        String Word1 = blabla.next(); // will capture the first word
        String Word2 = blabla.next(); // will capture the second word
        String Word3 = blabla.next(); // will capture the third word


        System.out.println("First Word is : "+Word1);
        System.out.println("Second Word is : "+Word2);
        System.out.println("Third Word is : "+Word3);





    }
}
