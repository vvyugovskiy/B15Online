package replit.$_101_150;

import java.util.Scanner;

public class ArraysPrintShortestWord_125 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortest = str[0];
        int minChar = 0;
        for (String eachStr :str) {
           // System.out.println(eachStr);
            if (eachStr.length() < shortest.length()) {
                shortest = eachStr;
            }

        }
        System.out.println("Shorteest"+shortest);

    }
}
