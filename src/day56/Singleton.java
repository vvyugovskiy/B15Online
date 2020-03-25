package day56;
// Sometimes we need to make a class that only generate a single object
// throughout the entire application

// This is a design pattern called Singleton
// it allows us to restrict the class to only be able to create one Object
// - add private static field with same type as class
// - add private constructor (so no one can call a new keyword)
// - add public method with return type same as class type

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // create object here
        } else {
            System.out.println("We already have this object"); // do not create an object if already created
        }
        return instance;
    }

    private Singleton() {
        System.out.println("NO ARG CONSTRUCTOR BEING CALLED!!!");
    }
}
