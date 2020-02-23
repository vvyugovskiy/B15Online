package replit.$_051_100;

import java.util.Scanner;

public class CountHi_098 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
// Print out the number of times that the string "hi" appears anywhere in the given string.
        int count = 0;
        while (str.contains("hi")){
            str=str.substring(str.indexOf("hi")+2);
            count++;
        }
        System.out.println(count);
    }
}
