package replit.$_051_100;

import java.util.Scanner;

public class StringNoEnd_072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

//        in this exercise you get a string called txt .
//        output txt without its last letter.
//        for example:
//        txt = "foo"
        String noLast = txt.substring(0,(txt.length()-1));
        System.out.println(noLast);

    }
}
