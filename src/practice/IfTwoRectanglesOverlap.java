package practice;

public class IfTwoRectanglesOverlap {

    static class Point {

        int x, y; // top left and bottom right corners of the rectangles

    }

    // Returns true if two rectangles (l1, r1) and (l2, r2) overlap
    public static boolean doOverlapRectangle(Point l1, Point r1, Point l2, Point r2) {
        if (l1.x > r2.x || l2.x > r1.x) return false;   // If one rectangle is on left side of other
        if (r1.y > l2.y || r2.y > l2.y) return false;   // If one rectangle is above other
        return true;
    }

    public static void main(String[] args) {
        Point l1 = new Point(),r1 = new Point(), l2 = new Point(),r2 = new Point();
        l1.x=0;l1.y=10; r1.x=10;r1.y=0;
        l2.x=5;l2.y=5; r2.x=15;r2.y=0;
        System.out.println(doOverlapRectangle(l1, r1, l2, r2));
    }



}
