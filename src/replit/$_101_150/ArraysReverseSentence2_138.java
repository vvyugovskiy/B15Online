package replit.$_101_150;

import java.util.Scanner;

public class ArraysReverseSentence2_138 {

    public static void main(String[] args) {

        // Given a String variable sentence, write code to get
        // each word and assign to String reversed in reverse order.

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here
//   Way #1:
        String[] stc = sentence.split(" ");
        for (int i = stc.length - 1; i >= 0; i--) {
            if (i != 0) {
                reversed += stc[i] + " ";
            } else {
                reversed += stc[i]; // could put reversed+=stc[0];
            }
        }

//   Way #2:
//        String[] arr = sentence.split(" ");
//
//        reversed = arr[arr.length - 1]; // First CHAR Does not come With a Space Before
//        for (int i = arr.length - 2; i >= 0; i--) {
//            reversed += (" " + arr[i]);  // ADDING A SPACE BEFORE THE CHAR
//        }

//   Way #3:
//        String[] splitted = sentence.split(" ");
//        for(int i = splitted.length - 1; i >= 0; i--){
//            reversed += splitted[i] + " ";
//        }
//        reversed = reversed.trim();  // SIMPLY trimming extra space in the end!

        //End your code here. do not modify below statement
        System.out.println(reversed);


    }
}
