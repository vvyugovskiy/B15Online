package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

//    Predicate<String> checkMore5Char = myString -> myString.length() > 5;
    Predicate<Integer> checkDivisibleBy5 = num -> num % 5 == 0;
    Predicate<Person> adultChecker = person -> person.age >= 18;


    public static void main(String[] args) {

//        Predicate<String> moreThan5Char
////                = new MoreThan5CharChecker();
//                = t ->  t.length()>5;
//        names.add();
//        names.add();
//        names.add();
//        names.add();
//        names.add();
        List<String> names = new ArrayList<>(Arrays.asList("James","John","Alexander","Daina","Johnattan"));
        names.removeIf(name ->name.length() >5 ); // if longer than 5 chars
        System.out.println(names);




    }
}
