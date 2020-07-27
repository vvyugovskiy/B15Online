package Cybertek.day26;

import java.util.Arrays;

public class ReverseArrayBySwapping {

    public static void main(String[] args) {

        int[] myNumbers = new int[]{5, 1, 21, 2, 1, 13, 8};
        int size = myNumbers.length;
        int lastIndex = size - 1;
        int midIndex = size / 2;

        System.out.println(Arrays.toString(myNumbers));

//     first and last swap
        System.out.println(myNumbers[0] + "---" + myNumbers[lastIndex - 0]);
//  second and one before last swap
        System.out.println(myNumbers[1] + "---" + myNumbers[lastIndex - 1]);

        System.out.println(myNumbers[2] + "---" + myNumbers[lastIndex - 2]);
//   loop SWAP
        for (int x = 0; x < midIndex; x++) {
            System.out.println("Before SWAP "+ myNumbers[x] + "---" + myNumbers[lastIndex - x]);

            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[lastIndex - x];
            myNumbers[lastIndex - x] = temp;
            System.out.println("After SWAP "+myNumbers[x] + "---" + myNumbers[lastIndex - x]);

        }

    }
}
