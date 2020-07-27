  package Cybertek.day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ManyFruits {

    public static void main(String[] args) {


        Apple f1 = new Apple("Sweet", "red", "Fuji");
        // Fruit is reference type , Apple is actual object Type
        Fruit f2 = new Apple("crispy", "hot-red", "Gala");
        Fruit f3 = new Orange("sour", "Orange", 12);
        Fruit f4 = new Orange("very sweet", "blood-red", 10);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Fruit[] myFruit = {f1, f2, f3, f4};
        for (Fruit each : myFruit) {
            each.getDigested();
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // asList makes it NOT resizable, cant add or remove
        // List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);

        // this is a regular ArrayList
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1, f2, f3, f4));

        for (Fruit each : fruitList) {
            System.out.println("each.toString = " + each.toString());
            System.out.println("Class type: " + each.getClass().getSimpleName());
        }

    }
}
