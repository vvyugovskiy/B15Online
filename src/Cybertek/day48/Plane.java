package Cybertek.day48;

// we build relationship between class and interface
// using implements keyword
//
public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;

    // public static final boolean HAVE_WING = true;

    @Override
    public void fly (){
        System.out.println("Plane is flying");
    }

    // BAD IDEA, JUST SAVING SPACE
    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();
        // anything static, we can access in static way
        // including the static of interface
        System.out.println(Flyable.HAVE_WING);
        // OR we can access it Directly
        System.out.println(HAVE_WING);

    }
}
