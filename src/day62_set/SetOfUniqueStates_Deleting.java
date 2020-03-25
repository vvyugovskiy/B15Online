package day62_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "SC", "OR", "FL", "ID", "ID", "CA", "TX", "FL", "NY", "VA", "VA"));
        System.out.println("states before = " + states);

//        states.remove("GA");  // remove GA State
//        System.out.println("states after = " + states);

        // 1 VERSION USING LAMBDA
//        states.removeIf(each->each.contains("A"));
//        System.out.println("states = " + states);

        // 2 VERSION USING ITERATOR
        // remove all the states with letter A
        Iterator<String> stIter = states.iterator();

        // Iterator has 3 methods hasNext(), next(), remove() works together
        // to remove item while iterating over a collection

        // 2.1 version :
//        while (stIter.hasNext()) {
//            String each = stIter.next();
//            if (each.contains("A")) {
//                System.out.println("removing = " + each);
//                stIter.remove();
//            }
//        }

        // 2.2 version :
        while (stIter.hasNext()) {
            // DO NOT CALL NEXT() TWICE OR WE WILL SKIPP THE ITERATION
            if (stIter.next().contains("A")) {
//                System.out.println("removing = " + stIter.next());
                stIter.remove();
            }
        }
        System.out.println("States after remove() = " + states);

        // it try to get the item you do note have we will get an NoSuchElementException
        // System.out.println(stIter.next());
        System.out.println(stIter.hasNext());
    }
}
