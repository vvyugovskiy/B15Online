package day62_set;

import java.util.*;

public class SetOfUniqueStates {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("GA", "SC", "OR", "FL", "ID", "ID", "CA", "TX", "FL", "NY", "VA", "VA"));
        System.out.println("How many states we got ?  : " + states.size());
//------------------------------------------------------------------------
        // forEach loop
//        for (String each : states) {
//            System.out.print(each + " : ");
//        }
//----------------------------------------------------------------------
        // iterator
//        Iterator<String> stIter = states.iterator();
//        while (stIter.hasNext()){
//            System.out.print(stIter.next() + " : ");
//        }
//---------------------------------------------------------------------
        // LAMBDA
        states.forEach(each -> System.out.println("Each state : " + each));

        // FOR I LOOP WILL NOT WORK -->> NO INDEX

    }
}
