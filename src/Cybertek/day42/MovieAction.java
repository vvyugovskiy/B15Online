package Cybertek.day42;

public class MovieAction {
    public static void main(String[] args) {

//        Movie m1 = new Movie();
//        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker", 2.2, "Drama");
        Movie m3 = new Movie("Frozen2", 1.5, "Family");
        Movie m4 = new Movie("Pursuit of Happines", 2.0, "Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        // i want to get the name of M2 seperatly so i can do some
        // i can no access the field directly cause it is private
        // i need a getter method to access
        // System.out.println(m2.name);
        System.out.println(m2.getName());
    }
}
