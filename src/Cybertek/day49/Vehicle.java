package Cybertek.day49;

public abstract class Vehicle{

    int year;

    public Vehicle(int year) {

    }

    public abstract void start ();

    public void goForward() {
        System.out.println("Car goes forward");
    }
}
