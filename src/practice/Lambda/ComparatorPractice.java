package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {

    public static void main(String[] args) {


//        Comparator<String> lastCharCom
////                = (o1, o2) -> o1.substring(o1.length() - 1).compareTo(o2.substring(o2.length() - 1))
//                = Comparator.comparing(str -> str.substring(2,3)) // sort by 3rd letter
//                ;

        List<String> names = new ArrayList<>(Arrays.asList("James", "John", "Alexander", "Daina", "Johnattan"));
//        names.sort(lastCharCom);
//        names.replaceAll(str ->str.substring(str.length()-4));
        names.sort(Comparator.comparing(str -> str.substring(str.length()-1))); // sort by last letter
        names.forEach(str -> System.out.println("each name : " + str));
    }
}