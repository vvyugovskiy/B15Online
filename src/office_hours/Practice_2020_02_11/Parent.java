package office_hours.Practice_2020_02_11;

import org.w3c.dom.ls.LSOutput;

public class Parent {

    String name;
    int age;
    int SSN;

    // default constructor --> method
    public Parent() {
        name = "This parent's name is unknown";
        age = -1;
        SSN = -1;
    }

    public Parent(String name, int age, int SSN) {
        this.name = name;
        this.age = age;
        this.SSN = SSN;
    }

    public void cookFood(String foodName) {
        System.out.println("Cooking " + foodName);
    }

    // method -->> action
    // void return
    // 1-User Story --> 3 test cases
    //
    public static void hi() {
        System.out.println("Hi, how are you?");
        System.out.println(12334);
        System.out.println(false);
    }

    // overloading
    public static String hi(String name) {
        return "Hello";
    }

    // with return type? we promise to return
    public static String hello() {
        return "Hello hello";
    }

    public static void main(String[] args) {
        // call void method -->> call by name
        hi();
        // call return method -->> 2 ways to call it
        System.out.println(hello());

        // 2nd way
        String greeting = hello();
        System.out.println(greeting);

        String word = "java";
        System.out.println(word.length()); //
        int lengthOfWord = word.length();

        int number = 9; // local variable
        System.out.println(number);
    }
}
