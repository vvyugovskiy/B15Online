package practice.OCA.t3;

class Vehicle {
    int x;

    Vehicle() {
        this(10); // Line 1
    }

    Vehicle(int x) {
        this.x = x;
    }
}

public class Car extends Vehicle {
    int y;

    Car() {
        super();
        //this(20); // Line 2     <<<=== FAILS AT LINE 2, have 2 constructors instead of 1
    }

    Car(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}