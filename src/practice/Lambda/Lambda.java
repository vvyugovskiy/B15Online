package practice.Lambda;

public class Lambda {

    // with parameter
    //    Movable movable = distance -> System.out.println("Moving " +distance+ " miles");
    //    Movable moveUp = distance -> System.out.println("Going " +distance+ " up");

    // with no parameters
    //    Movable goingUp = () -> System.out.println("Hello World");

    // with boolean return type
    //    Movable checkMoreThan5Km = distance -> { return distance * 1.6 > 5; };
    //    Movable checkMoreThan5Km = distance -> distance * 1.6 > 5;

    public static void main(String[] args) {
// 3.--------------------------------------------------------------------------------------------
        Movable moveXmile = (int mile) -> {
            System.out.println("moving " + mile);
        };

        Movable moveShort =
                mile -> System.out.println("moving short mile " + mile);

        moveAction(moveXmile);
        moveAction(mile -> System.out.println("moving short mile " + mile));
//---------------------------------------------------------------------------------------------------------
// with no parameters
        Measurable m1 = () -> System.out.println("measuring Square");
        Measurable m2 = () -> System.out.println("measuring Rectangle");

        Measurable m3 = () -> {
            System.out.println("measuring Circle step 1");
            System.out.println("measuring Circle step 2");
            System.out.println("measuring Circle step 3");
        };

        m1.measure();
        m2.measure();
        m3.measure();
//----------------------------------------------------------------------------------------------------------
// with 2 parameters

        Computable adder = (num1, num2) -> System.out.println("adding result " + (num1 + num2));
        Computable multiplier = (num1, num2) -> System.out.println("adding result " + (num1 * num2));

        adder.compute(10, 12);
        multiplier.compute(10, 30);
//----------------------------------------------------------------------------------------------

        Flyable drone = (int mile) -> mile > 10;

        System.out.println(drone.flyHigh(12));
        System.out.println(drone.flyHigh(8));

        Flyable seaPlane = mile -> mile < 10 && mile % 5 == 0;

        System.out.println(seaPlane.flyHigh(12));
        System.out.println(seaPlane.flyHigh(8));

//------------------------------------------------------------------------------------------------
//  1.      Movable moveXmile = new DistantMover();
//        moveXmile.move(15);
//-------------------------------------------------------------------------------
// 2.       Movable moveXmile = new Movable() {
//            @Override
//            public void move(int mile) {
//                System.out.println("moving " + mile);
//            }
//        };
//        Movable moveShort = new ShortDistantMover();
//        moveShort.move(5);


    }

    public static void moveAction(Movable moveable) {
        moveable.move(100);
    }
}