package practice.Collections.java_collection;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return (this.name.compareTo(other.name) == 0)
                ? Integer.compare(this.age, other.age)
                : this.name.compareTo(other.name);

//        if (this.name.charAt(0) > other.name.charAt(0)) {
//            return 1;
//        } else if (this.name.charAt(0) == other.name.charAt(0)) {
//            if (this.age > other.age) {
//                return 1;
//            } else if (this.age == other.age) {
//                return 0;
//            } else {
//                return -1;
//            }
//        } else {
//            return -1;
    }
}
