package java8Class;

public class Person {
//    String firstName;
//
//    static void setFirstName(String newValue) {
//       // firstName = newValue; WILL NOT COMPILE
//    }
//
//    public static void main(String[] args) {
//        Person p = new Person();
//        p.setFirstName("Jason");
//        System.out.println("firstName: " + p.firstName);
    {
        personCount = 10;
    }

    static {
        personCount = 20;
    }

    private static int personCount = 1000;

    {
        personCount = 30;
    }

    static {
        personCount = 40;
    }

    public static void main(String[] args) {
        System.out.println(Person.personCount); // 40
        Person p = new Person();
        System.out.println(Person.personCount); // 30
        Person.personCount = 100;
        p = new Person();
        System.out.println(Person.personCount); // 30
    }
}




