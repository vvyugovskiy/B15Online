package day62_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// primary difference between HashSet and LinkedHashSet is that LHS keeps the insertion order
// HashSer always faster since it has less responsibility

public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        // KEEPS THE INSERTION ORDER
        // DOES NOT ALLOW DUPLICATES
        // IT'S SUBCLASS OF HASHSET
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums/LinkedHashSet = " + myNums);

        Set<Integer> myNums2 = new HashSet<>();
        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(22);
        myNums2.add(13);
        myNums2.add(13);
        myNums2.add(30);
        myNums2.add(30);

        System.out.println("myNums2/HashSet = " + myNums2);
    }
}
