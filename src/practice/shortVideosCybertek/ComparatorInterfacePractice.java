package practice.shortVideosCybertek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {

    public static void main(String[] args) {

        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John", 20));
        plst.add(new Person("John", 10));
        plst.add(new Person("Adam", 38));
        plst.add(new Person("Mary", 15));

        Collections.sort(plst);
        // Collections.sort(plst,c);
        Comparator<Person> comp =
                new PersonNameComparator();
        Collections.sort(plst, comp);
        System.out.println("plst = " + plst);

        //LAMBDA ageComparator
        Comparator<Person> ageComparator =
                Comparator.comparing(p -> p.age);
        Collections.sort(plst, ageComparator);
        System.out.println("plst = " + plst);

        // LAMBDA nameComparator
        Comparator<Person> nameComparator =
                (o1,o2)->o1.name.compareTo(o2.name);

        Collections.sort(plst,nameComparator);
        System.out.println("plst = " + plst);
    }
}
