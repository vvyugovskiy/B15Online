package day45;

public class Apple extends Fruit {

    // if we don't have any constructor
    // we will get default constructor
    // and compiler automatically call
    // no arg constructor of super class by inserting super()
    public Apple (){
        super(" "); // needs to be in FIRST position
        // i want to reuse a functionality
        // already written in super class constructor
        // we can use super() or super(arg)
        // to call super class's constructor
        // super();

        // calling a constructor with 1 arg
        // super("test");

        // can call super() more than ones?
        // !!! NO !!!
        // if no super() it calls First constructor
        // System.out.println("Message from Apple constructor");
    }

    public static void main(String[] args) {

        Apple a1 = new Apple();
    }
}
