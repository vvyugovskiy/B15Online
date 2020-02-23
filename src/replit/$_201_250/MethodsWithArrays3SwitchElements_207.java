package replit.$_201_250;

import java.util.*;

public class MethodsWithArrays3SwitchElements_207 {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4};
        int temp = i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;
        System.out.println(Arrays.toString(i));
    }
}

