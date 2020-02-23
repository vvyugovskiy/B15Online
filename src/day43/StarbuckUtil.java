package day43;

public class StarbuckUtil {

    public static void main(String[] args) {


        String myString = new String("Hello");
        printStringInfo(myString);
        printStringInfo("abc");

        Coffee c  = new Coffee("Blonde",5, 1.6);
        printCoffeeInfo(c);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c);

        printCoffeeInfo(new Coffee("Intensito",10));

        // we would need an object of current class
//        StarbuckUtil util = new StarbuckUtil();
//        util.printStringInfo(myString);


    }

    public static void printStringInfo(String str) {

        System.out.println("First character is : " + str.charAt(0));
        System.out.println("Last character is : " + str.charAt(str.length() - 1));
    }

    // Create a static method to accept a coffee object and print it's information
    // like this: This coffee is : name, price is <price>, caffeine Level is <level>

    public static void printCoffeeInfo(Coffee co) {
        System.out.println("This coffee is : " + co.getType());
        System.out.println("Price is : " + co.getPrice());
        System.out.println("Caffeine Level is : " + co.getCaffeineLevel());


    }

}
