package Cybertek.day47;

public class ShapesMain {

    public static void main(String[] args) {

        Triangle t1 = new Triangle("Triangle",4,3);
        t1.calculateArea();
        System.out.println(t1);


        Rectangle r1 = new Rectangle("Rectangle",5,4);
        r1.calculateArea();
        System.out.println(r1);

        Oval o1 = new Oval("Oval",5,3);
        o1.calculateArea();
        System.out.println(o1);

        Cube c1 = new Cube("Cube",4);
        c1.calculateArea();
        System.out.println(c1);
    }
}
