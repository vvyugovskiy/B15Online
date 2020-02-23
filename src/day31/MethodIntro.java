package day31;

public class MethodIntro {

// WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE !!!! AVOID CODE DUPLICATED

    public static void main(String[] args) {
// two ways to call static method
        // ClassName.methodName (External data if needed)
        //if you are in same class
        // you can directly call them
        // methodName (external data if needed)
        // MethodIntro.sayHello(); // OPTIONAL if you are in same
        System.out.println("Begin");
        sayHello();
        System.out.println("___________");
        sayHello();
        System.out.println("THE END");
        // 12--> 13 (21,23,24,25) -> 14 -> 15(21,23,24,25)- > 16-> DONE!!!
    }   // <<--- MAIN METHOD ENDS HERE
        // DO NOT CREATE A METHOD INSIDE MAIN METHOD

    public static void sayHello() {

        System.out.println("Hello World ");
        System.out.println("My Name is Vladislav ");
        System.out.println("I love Java ");
    }
}
