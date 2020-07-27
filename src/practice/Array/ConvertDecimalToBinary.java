package practice.Array;

import java.util.Arrays;

public class ConvertDecimalToBinary {

    public static void main(String[]args){

        decimalToBinary(255);
    }

    public static void decimalToBinary(int decimal) {
        int[] binary = new int[8];
        if (decimal<=255 && decimal>0){
            for (int j = 7; j >= 0; j--) {
                binary[j] = decimal % 2;
                decimal /= 2;
            }
            System.out.println(Arrays.toString(binary));
        }else{
            System.out.println("decimal out of bound");
        }

    }
}
