package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConvertDecimalToBinary_133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

       // TODO: Write your code below.

        for (int x = 7; x >= 0; x--) {
            binary[x] = decimal % 2;
            decimal /= 2;
        }
        System.out.println(Arrays.toString(binary));

//        WAY 2:
//        int i=0;
//        int x=256;
//        int y=128;
//        for (int converter:binary){
//            binary[i]=decimal%x/y;
//            x/=2;
//            y/=2;
//            i++;
//        }
//        System.out.println(Arrays.toString(binary));
    }
}