package replit.$_201_250;
import java.util.*;
public class MethodsWithArrays2AddElements_205 {
    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] arr = new int[ints1.length];
        for (int i = 0; i < ints1.length-1; i++) {
            arr[i]=ints1[i]+ints2[i];
        }
        return arr;
    }
//    public static void main(String[] args) {
//        int [] one = {1,2,3,4,5};
//        int [] two = {7,8,9,10,12};
//        int [] arr = new int[one.length];
//        for (int i = 0; i < one.length; i++) {
//            arr[i]=one[i]+two[i];
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
