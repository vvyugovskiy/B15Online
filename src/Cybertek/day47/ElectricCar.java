package Cybertek.day47;

public class ElectricCar extends Car{

    int batteryLevel;

    @Override
    public void start(){ System.out.println("This is how ECar starts"); }

    @Override
    public void goForward() {
        System.out.println("We go forward");
    }

    @Override
    public void goBackward() {
        System.out.println("We go backward");
    }

    @Override
    public void turn(String direction) { System.out.println("Car will turn " + direction); }

}
