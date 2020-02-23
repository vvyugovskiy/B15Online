package replit.$_101_150;

import java.util.Scanner;

public class PrintVowels_106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In");
        String word = inp.nextLine();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
             if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i'|| word.charAt(i)=='o' ||word.charAt(i)=='u'){
                 result+=word.charAt(i);
             }
        }
        System.out.println(result);
    }
}
