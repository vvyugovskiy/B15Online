package office_hours.Practice_2020_02_10;

class Circle {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {  // checks if two circles has same radius or not

        // Object o1 = new Circle(3.4);
        // Object o2 = new String ();
        if (o instanceof Circle) { // checks if o a Circle object or not
            if (radius == ((Circle) o).radius) { // checks if two Circles have the same radius or not
                return true;
            }
        }
        return false;
    }

    /*
    instanceof:
        syntax:
            referenceName  instanceof   className
     */
}

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(3.5);
        Object c3 = new String();

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

        Circle c4 = new Circle(7);
        Circle c5 = new Circle(8);
        System.out.println(c4.equals(c5));


    }

}
