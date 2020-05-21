package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    Function<String, Integer> lengthGetter = str -> str.length();
    Function<String, String> doubleTheStr = str -> str + "-" + str;
    Function<Person, Integer> personBirthYearGetter = p -> 2019 - p.getAge();

    public static void main(String[] args) {

        Function<String, Integer> lengGetter = t -> t.length();
//                = new StringLengthGetter();


        Comparator<String> lastCharCom
                = (o1,o2) -> o1.substring(o1.length()-1).compareTo(o2.substring(o2.length()-1));

        System.out.println(lengGetter.apply("ABC"));

        List<String> names = new ArrayList<>(Arrays.asList("James", "John", "Alexander", "Daina", "Johnattan"));

        List<Integer> lengthList = new ArrayList<>();
        names.forEach(name -> lengthList.add(lengGetter.apply(name)));
//        for (String name : names) {
//            lengthList.add(lengGetter.apply(name));
//        }
        System.out.println(lengthList);

    }
}
