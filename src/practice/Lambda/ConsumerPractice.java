package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    Consumer<String> strPrinter = arg -> System.out.println(arg);
    Consumer<Integer> squareAreaCalculator = arg -> System.out.println(arg * arg);
    Consumer<Person> setPersonInfo = p -> p.setName("Some Name");

    public static void main(String[] args) {

        Consumer<String> doublePrinter = t -> System.out.println(t + " || " + t);

//                = new StringDoublePrinter();

        doublePrinter.accept("apple");
        doublePrinter.accept("oracle");

        List<String> names = new ArrayList<>(Arrays.asList("James", "John", "Alexander", "Daina", "Johnattan"));
        names.forEach(doublePrinter);
        names.forEach(str -> System.out.println(str + " | " + str + "  | " + str));
    }
}
