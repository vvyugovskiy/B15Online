package replit.$_101_150;

import java.util.Scanner;

public class ArraysPrinting_03_118 {
    public static void main(String[] args) {
//        The code provided in your main method will take in six Strings and save them into an array called arr.
//        Print out the 3 neighboring items of the array in one line until the last line
//        each line should contain 3 neighboring items of array element as displayed below
//        user for loop
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 6 items
        //and print three neighbouring items at a time till last item
        //write your code below
// FOR LOOP WAY
        for (int x = 0; x <= arr.length - 3; x++) {
            System.out.println(arr[x] + " , " + arr[x + 1] + " , " + arr[x + 2]);
        }

// nested FOR LOOP WAY
        for (int x = 0; x <= arr.length - 3; x++) {
            for (int y = x; y < x + 3; y++) {
                System.out.print(arr[y]);
                if (arr[y] != arr[x + 2]) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }
}
