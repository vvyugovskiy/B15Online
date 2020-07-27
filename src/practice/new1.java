package practice;

import java.util.Arrays;

public class new1 {

    public static void main(String[] args) {

//        System.out.println(adjacentElementsProduct(new int[]{3, 6, -2, -5, 7, 3}));
//        System.out.println(shapeArea(5));
        System.out.println(makeArrayConsecutive2(new int []{6, 2, 3, 8}));
        System.out.println(makeArrayConsecutive2(new int []{5, 4, 6}));

    }

    public static int adjacentElementsProduct(int[] inputArray) {

        int max = -1000;
        for (int i =0; i <inputArray.length-1; i++){
            if (inputArray[i]*inputArray[i+1] > max){
                max=inputArray[i]*inputArray[i+1];
            }
        }
        return max;
    }

    public static  int shapeArea(int n) {

        return (n*n) + (n-1)*(n-1);
    }

    public static int makeArrayConsecutive2(int[] statues) {
//            int number = 0;
//            Arrays.sort(statues);
//            for (int i =0; i < statues.length-1; i++){
//                if(statues[i+1]-statues[i]==1){
//                    continue;
//                }else {
//                    number += statues[i+1]-statues[i]-1;
//                }
//            }
//            return number;
        Arrays.sort(statues);
        int number = statues[statues.length-1]-statues[0];
        return number - statues.length+1;
    }
}
