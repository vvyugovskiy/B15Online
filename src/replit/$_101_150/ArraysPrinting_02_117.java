package replit.$_101_150;

import java.util.Scanner;

public class ArraysPrinting_02_117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below
        for (int i=0;i<arr.length-2;i++){
            System.out.print(arr[i]+arr[i+2]);
        }

    }
}
