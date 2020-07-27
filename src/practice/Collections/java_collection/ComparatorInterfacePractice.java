package practice.Collections.java_collection;

import java.util.*;

public class ComparatorInterfacePractice {

    public static void main(String[] args) {

        List<Person> plst = new ArrayList<>();
        plst.add(new Person("John", 20));
        plst.add(new Person("John", 10));
        plst.add(new Person("Adam", 32));
        plst.add(new Person("Mary", 15));

        Collections.sort(plst);
        // Collections.sort(list,c);
        Comparator<Person> comp =
                new PersonNameComparator();
        Collections.sort(plst, comp);
        System.out.println(plst);

        Comparator<Person> ageComparator = Comparator.comparing(p -> p.age);
        Collections.sort(plst, ageComparator);
        System.out.println("After compared by age : " + plst);

        Comparator<Person> nameComparator = (Person o1, Person o2) -> o1.name.compareTo(o2.name);
        // lambda
        Collections.sort(plst, nameComparator);
        System.out.println("After compared by name : " + plst);
        // lambda
        Comparator<Person> nameReverseComparator = (o1, o2) -> o2.name.compareTo(o1.name);
        Collections.sort(plst, nameReverseComparator);
        System.out.println("After compared by name reversed : " + plst);

        // combine 2 methods
        Comparator<Person> nameRTheAgeComparator =
                nameReverseComparator.thenComparing(ageComparator.reversed());
        Collections.sort(plst,nameRTheAgeComparator);
        System.out.println(plst);


    }
}
