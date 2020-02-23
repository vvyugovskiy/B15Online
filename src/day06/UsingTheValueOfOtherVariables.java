package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourNumber = myFavoriteNumber;

        System.out.println("My favorite Number " +myFavoriteNumber);
        System.out.println("Your favorite Number " +yourNumber);

        yourNumber = 100;
        System.out.println("My favorite Number " +myFavoriteNumber);
        System.out.println("Your favorite Number " +yourNumber);

        // create a var. yourOreder. type String and assign a value
        // optionally assigh this value using Scanner
        // Create another var. called myOrder and assign value
        // to same order as yourOrder by copying
        // and just print them

        String yourOrder = "Boots";
        String myOrder = yourOrder;
        System.out.println("Your order is : "+yourOrder);
        System.out.println("My order is : "+myOrder);


    }
}
