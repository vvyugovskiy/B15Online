package Cybertek.day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Long> lst = new ArrayList<>();

        // C.R.U.D.
        //       Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...
        // Adding an item
        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        //Printing an ArrayList
        System.out.println(lst);
        // Getting a number of items in an ArrayList
        System.out.println("Number of items : " + lst.size());
        //Getting items inside ArrayList object
        System.out.println("First item is : lst.get(0) = " + lst.get(0));

        //TASK: Get the SUM of above arrayList Items

        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum = sum + lst.get(i);
        }
        System.out.println(sum);

        // GET THE MAX
        long max = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }

        }
        System.out.println(max);
    }

}
