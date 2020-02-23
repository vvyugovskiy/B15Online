package replit.$_051_100;

import java.util.Scanner;

public class StringNoEnd_082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //  your code here
//        In this exercise you get a string called txt .
//        output txt without its last letter.
        System.out.println(txt.substring(0,txt.length()-1));
    }
}
