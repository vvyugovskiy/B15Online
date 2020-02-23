package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        // this is ArrayList costructor that accepts any type Collection object
        // public ArrayList(Collection<E> c) { }
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        // iteration over as collection object using iterator
        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()) {
            // System.out.println("myIter.next() = " + myIter.next());
            if (myIter.next() <= 10) {
                myIter.remove();
            }
        }

        System.out.println("nums = " + nums);
//        // hasNext() -->> check whether you have next item
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        // next() -->> will move the pointer of iterator to the next element
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        // removing whatever is the iterator is pointing to at this location
//        myIter.remove();
//
//        System.out.println("myIter.next() = " + myIter.next());
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());


    }
}
