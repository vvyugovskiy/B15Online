package day51.polymorhism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Rectangle();
        Shape s5 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();
        System.out.println("+++++++++++++++++++++++++++++");
        //create an Array of shape to store 5 concrete Shape Objects
        // and call the draw the number

        // ArrayList of Shape and call a draw();

        Shape [] shp = {s1,s2,s3,s4,s5};
        for (Shape each: shp ) {
            each.draw();
        }

        System.out.println("++++++++++++++++++++++++++++++");
        List<Shape> shp1 = new ArrayList<>();
        shp1.add(s1);
        shp1.add(s2);
        shp1.add(s3);
        shp1.add(s4);

        for (int i = 0; i < shp1.size(); i++) {
            shp1.get(i).draw();
        }
    }
}
