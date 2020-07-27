package practice.Array;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        int [] intArray = {2,15,7,1,3};
        Arrays.sort(intArray);

        for (int item: intArray){
            System.out.println("numbers "+item);

            int [] ints = {2,15,7,1,3};
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));
            System.out.println(ints);

            String [] names = {"John","Adam","Don"};
            Arrays.sort(names);
            for (String item2: names){
                System.out.println("names "+item2);
            }

        }

    }
}
