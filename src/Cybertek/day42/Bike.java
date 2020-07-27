package Cybertek.day42;

public class Bike {

    int speed;
    int gear;

    // constructor is a block of code
    // that has same neme as classname
    // and has no return type
    // this is does not meet above requirements
    // it will not be a constructor
    // the only time you can call this is :
    // when object is being created

    public Bike() {
        System.out.println("Message from constructor");
        gear = 1;
    }

    public Bike(int newGear) {
        gear = newGear;
        // this.gear = newGear ;
    }

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public Bike (String str){
        System.out.println("Accept String!");
    }
}
