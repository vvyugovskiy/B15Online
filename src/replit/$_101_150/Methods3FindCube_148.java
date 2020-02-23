package replit.$_101_150;

import java.util.Scanner;

public class Methods3FindCube_148 {

    // Given method called cube. Write all required code inside this method
    // in order  to asks the user for a number and then prints the cubed value of that number:

    public static void cube() {
        //your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cube = n * n * n;
        System.out.println(cube);
    }//end cube

    public static void main(String[] args) {

        cube();

    }
}