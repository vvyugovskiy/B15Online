package replit.$_151_200;

import java.util.*;

public class Methods10PrintNext3Numbers_155 {

    //Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.
    //enter number
    //1
    //next 3 are:
    //2 3 4
    //(put a space between numbers)
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int num) {

// Way#1:
        System.out.println(num + 1 + " " + (num + 2) + " " + (num + 3));
// Way#2
//        for (int a = num + 1; a < num + 4; a++) {
//            System.out.print(a + " ");
//        }
    }
}
