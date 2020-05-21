package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CalculatePractice {

    static int calculateNumbers(int x, int y, Operation operation) {
        return switch (operation) {
            case add -> x + y;
            case divide -> x / y;
            case multiply -> x * y;
            case subtract -> x - y;
            case mod -> x % y;
        };
    }
    public static void main(String[] args) {

        System.out.println("calculateNumbers = " + calculateNumbers(2, 2, Operation.add));

//--------------------------------------------------------------------------------------------------------------------

        List<String> names = new ArrayList<>(Arrays.asList("Vladislav", "Taha", "Kutlu", "Gulay", "AbideRana", "Aybetul"));
//        Predicate<String> moreThan7Length = t -> t.length() < 7;
//        names.removeIf(moreThan7Length);
//        names.sort(String::compareTo);
        names.removeIf(t -> t.length() < 7);
        names.forEach(string -> System.out.print(" " + string));
//        System.out.println("names = " + names);
//-------------------------------------------------------------------
//        Stream<String> allnames = names.stream();
//        Stream<String> longNames = allnames.filter(t -> t.length() >6);
        Stream<String> sortNames = names.stream().filter(t -> t.length() >6);
//        sortNames.forEach(str -> System.out.print(" | " + str));

        System.out.println();
//-------------------------------------------------------------------------------------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // using lambda to print all elements.
        list.forEach(numbers -> System.out.print(numbers));
        //using lambda expression to print even elements
        list.forEach(numbers -> {
            if (numbers % 2 == 0) System.out.println(numbers);
        });
        // sorting int array
        int[] numbers = {22, 89, 1, 32, 19, 5, 15, 1, 4, 5,};
        // Arrays.parallelSort(numbers);
        // System.out.println(numbers.toString());
        // array to stream using for each loop
        Arrays.stream(numbers).forEach(nums -> System.out.print(nums + " "));
        Arrays.parallelSort(numbers, 0, 4);
        Arrays.stream(numbers).distinct().forEach(System.out::print);
        System.out.println(Arrays.toString(numbers));

    }
}
