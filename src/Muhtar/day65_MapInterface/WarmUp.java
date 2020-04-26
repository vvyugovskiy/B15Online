package Muhtar.day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WarmUp {

    public static void main(String[] args) {

        //write a program that can remove all even numbers from a List Interface

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        // for (Initialization, Condition; Iterator)
        for (Iterator<Integer> it = list1.iterator(); it.hasNext(); ) {
            int a = it.next();
            if (a % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(list1);

        // Solution2
        // Write a program that can remove the odd numbers from a List Interface
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2));
        Iterator<Integer> it2 = list2.iterator();

//        System.out.println(it2.hasNext());  // true
//        System.out.println(it2.next());     // 1
//        System.out.println(it2.hasNext());  // true
//        System.out.println(it2.next());     // 2
//        System.out.println(it2.hasNext());  // false

        while (it2.hasNext()) {
            int num = it2.next();
            if (num % 2 != 0) {
                it2.remove();
            }
        }
        System.out.println(list2);
    }
}
