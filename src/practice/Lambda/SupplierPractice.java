package practice.Lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierPractice {

    Supplier<String> provideStr = () -> new String("Your String");
    Supplier<Integer> randomNumber = () -> new Random().nextInt();
    Supplier<Person> personSupplier = () -> new Person("Some Name",28);

    public static void main(String[] args) {
    }
}
