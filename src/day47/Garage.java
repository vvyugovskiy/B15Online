package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // Car c1 = new Car();

        ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right");

        // sub gasCar
        // add  a field gasLevel
        // implement all the abstract method

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("left");
    }
}
