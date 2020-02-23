package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintShortestWord_2_126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(", ");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        String shortest=words[0];
        for (String eachWord : words) {
            if (eachWord.length()<shortest.length())
                shortest=eachWord;
        }
        String result ="";
        for (int x = 0; x < words.length; x++) {
            if (words[x].length()==shortest.length()){
                result+=words[x]+" ";
            }
        }
        // System.out.println(result);
        String [] res = result.split(" ");
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}