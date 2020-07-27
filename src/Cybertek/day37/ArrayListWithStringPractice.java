package Cybertek.day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg"); // when we remove Cyborg , Flash become the item at index 2
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("superHeros = " + superHeros);
        // remove any heroes that does not have man in the String
        for (int i = 0; i < superHeros.size(); i++) {
            String currentHero = superHeros.get(i);
            if (!currentHero.contains("man")) {
                superHeros.remove(currentHero);
                // once hero is removed, this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index
                --i; // once item is removed , it will decrease the index to stay at same index in next iteration
            }
        }
        System.out.println("SuperHeros" + superHeros);
        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing

//        // Do we have superman in the list ?
//        System.out.println("superHeros.contains(\"Superman\") = "
//                            + superHeros.contains("Superman"));
//
//        // does this this contains an item with exact value of man
//        System.out.println("superHeros.contains(\"man\") = "
//                            + superHeros.contains("man"));
        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);
        List<String>topics = Arrays.asList("Cybertek","Selenium","Database","API");
        System.out.println("topics = " + topics);

        //topics.add("JIRA"); //ERROR!!
        //topics.remove("Java"); //ERROR!!
        topics.set(0,"Awesome Java"); // OK!
        System.out.println("topics = \n\t" + topics);

        // HERE COPYING EVERYTHING inside topic to topicCopy
        // And it's just regular ArrayList , we can do anything with it !!!
        List<String> topicsCopy =  new ArrayList<>( topics ) ;
        topicsCopy.add("Interview Prep"); //GOOD!!
        System.out.println("topicsCopy after adding item = \n\t" + topicsCopy);

        // After Java 9  Arrays.asList(...) has been improved by List.of(...)
        // It's important to know Arrays.asList(...) because lots of company still using Java 8
        // and yes this is the simplest way to
        // create a type of unmodifiable(non-resizable) List Object (not ArrayList)
        List<String> oop = List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ;
        System.out.println("oop = " + oop);
        // and again if we want to save it into a regular ArrayList Object we can do :
        List<String> oopCopy = new ArrayList<>( oop ) ;
        // or in one shot
        List<String> oopLst = new ArrayList<>( List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ) ;
        System.out.println("oopLst in one short= " + oopLst);
    }
}
