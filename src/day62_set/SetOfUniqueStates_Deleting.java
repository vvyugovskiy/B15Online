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

        // remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        while (stIter.hasNext()) {
            String each = stIter.next();
            if (each.contains("A")) {
                System.out.println("removing = " + each);
            }
        }

    }
}
