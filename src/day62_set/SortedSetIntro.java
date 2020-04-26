package day62_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        // SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet

        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);


        System.out.println("mySet.first() = " + mySet.first());  // returns the lowest

        System.out.println("mySet.last() = " + mySet.last());   // returns the highest

    }
}
