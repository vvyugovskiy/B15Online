package practice.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class mew {


    public static void main(String[] args) {

        String [][]arr = {{"A","B"},{"C","D"}};
        System.out.println(arr.length);
        System.out.println(arr[0][0] +"|"+ arr[0][1] +"|"+ arr[1][0] +"|"+ arr[1][1]);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,4,8,9,1,45,7,45));
        System.out.println("Does ArrayList has duplicates :: " + (list.size()!= list.stream().distinct().count()));
    }
}
