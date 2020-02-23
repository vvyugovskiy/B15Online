package replit.$_101_150;

import java.util.*;

public class ArraysInnerAndOuter_134 {
    public static void main(String[] args) {

//  Given two arrays of ints sorted in increasing order, outer and inner,
//  print out true if all of the numbers in inner appear in outer.
//  Take advantage of the fact that both arrays are already in sorted order.

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        //WRITE YOUR CODE HERE
        // WAY 1:
        int count=0;
        for (int i = 0; i < sizeInner; i++) {
            for (int j = 0; j < sizeOuter; j++) {
                if (inner[i]==outer[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count==sizeInner);
//         DID not understand
//        boolean result = true;
//        for (int i = 0; i < inner.length; i++) {
//            int a = Arrays.binarySearch(outer,inner[i]);
//            if (a>=0){
//                result=true;
//            }else{
//                result=false;
//                break;
//            }
//        }
//        System.out.println(result);
    }
}
