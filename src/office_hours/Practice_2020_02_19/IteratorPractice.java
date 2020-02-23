package office_hours.Practice_2020_02_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {


        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));

        Iterator<Integer> numIter = lst.iterator();


        System.out.println("hasNext() to check if we have element at next position \n" + numIter.hasNext());
        System.out.println("next() moves to next item : " + numIter.next());
        System.out.println("next() moves to next item : " + numIter.next());

    }
}
