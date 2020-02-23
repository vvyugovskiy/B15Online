package replit.$_101_150;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack1_127 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];

        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int[] extinct = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int x = 0; x < inhabitants.length; x++) {
           // System.out.print();
            System.out.println("Day " + x + " "+Arrays.toString(inhabitants));
            if (Arrays.equals(inhabitants, extinct)) {
                break;
            }
            for (int j = 0; j < inhabitants.length; j++) {
                inhabitants[j] /= 2;
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}


