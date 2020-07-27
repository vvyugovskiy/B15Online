package Cybertek.day39;

public class Car {

    //
    int yearProduced;
    String brand;
    String model;
    String color;
    String licenceState;
    int millage;

    //Create a method to print how old is this car
    public void printAge() {
        System.out.println("Car age : " + (2020 - yearProduced));
    }
    // instance method are tied to the object
    //it does not have a static word
    // we need an object when we call them

    public void goForward() {
        System.out.println(model + " Going forward");
    }
    // create a method that change the color
    public void changeColorTo (String newColor){
        // Write bunch of code here to validate
        // user is actualy passing correct color
        //for example Red, Blue is valid color
        //          ABC, EFG is not a valid color
        color = newColor;
    }
}
