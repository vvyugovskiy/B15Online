package replit.$_051_100;

import java.util.Scanner;

public class HasAJava_093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean result = false;
        if (word.indexOf("java") == 0 || word.indexOf("java") == 1) {
            result=true;

        }else{
            result=false;
        }
        System.out.println(result);
    }
}