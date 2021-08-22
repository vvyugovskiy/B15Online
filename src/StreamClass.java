import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {

        //----------------------------------------------------------------------
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Tree");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream stream = list.stream();
        stream.filter(x -> x.toString().length() == 3).forEach(System.out::println);
//-------------------------------------------------------------------------
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10).limit(3).forEach(System.out::print);

        // OR

        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x = x + 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }
//------------------------------------------------------------------------------------------------

        // filter (Predicate predicate) ==> true or false
        // map (Function mapper) ==> Function<T,R> conversion T to R
        // flatMap (Function <T, Stream<R>> mapper) conversion of T into primitive Stream

//--------------------------------------------------------------------------------------------

        String[] array = {"java", "Rush"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s -> s.split("")) // Conversion into a Char sequence
                .flatMap(Arrays::stream).distinct()  // выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
