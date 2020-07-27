package Cybertek.day48;

// this is how we create the interface
// interface is abstract type just like abstract class
// NO Object can be created form it
// it provides guidelines for implementing classes
// LIKE signing a contract
public interface Flyable {

    // an interface CAN ONLY have public static final field

    public static final boolean HAVE_WING = true;

    // CAN NOT have a CONSTRUCTOR!!!

    public  abstract  void fly();

}
