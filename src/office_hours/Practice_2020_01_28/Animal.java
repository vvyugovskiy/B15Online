package office_hours.Practice_2020_01_28;

public abstract class Animal implements Zoo{

    //1. no object creation

    // default constructor
    public Animal (){

    }
    // information -->> variable

    // variables ==> local, instance, static

    int age;
    String color;
    String breed;

    // Actions -->> method
    // method --> instance, constructor

    // concrete method
    public void eat (){
        System.out.println("The animal is eating");
    }

    public void call (){
        System.out.println("The animal is calling...");
    }

    // what if we just declare a method that should be in child class, and they have different body

    //abstract method
    // so. this method should appear in both classes with different bodies
    public abstract void run();



}
