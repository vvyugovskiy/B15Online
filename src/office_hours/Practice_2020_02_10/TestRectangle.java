package office_hours.Practice_2020_02_10;

class Rectangle {

    public double l, w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public boolean equals(Object o) {

        if (o instanceof Rectangle) {
            double Area1 = l * w;
            double Area2 = ((Rectangle) o).l * ((Rectangle) o).w;
            if (Area1 == Area2) {
                return true;
            }
        }
        return false;
    }
}

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(4, 3);
        Rectangle r3 = new Rectangle(5, 3);


        System.out.println(r1.equals(r2));
        System.out.println(r2.equals(r3));
    }
}
