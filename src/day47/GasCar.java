package day47;

// this is called concrete class
// concrete class must provide body for all inherited abstract methods
// or it will not even compile
public class GasCar extends Car {

    int gasLevel;

    @Override
    public void start() {
        System.out.println("Gas Car is starting");
    }

    @Override
    public void goForward() { System.out.println("Gas Car is going forward"); }

    @Override
    public void goBackward() { System.out.println("Gas Car is going backward"); }

    @Override
    public void turn(String direction) { System.out.println("Gas Car is turning "+ direction); }
}
