package day53;

public class FruitShop {

    //Only Reference Type Decide what you can access at compile time
    // if we have Fruit as reference type , getDigested method will point to the one under Fruit class
    //Actual object type decide what method will be called at run time
    // since actual object is Apple|Orange , at run time it will call overriden version of the method
    // and that's the power of polymorphism , making the correct decision at runtime according to the actual object
    public static void main(String[] args) {

        Apple a1 = new Apple("Sweet", "red", "Fuji");

        // a1 has Apple as reference type, so can access anything inside Apple
        System.out.println("a1.taste" + a1.taste);
        System.out.println("a1.color" + a1.color);
        System.out.println("a1.type" + a1.type);

        a1.getDigested();
        System.out.println(a1.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        // if Fruit does not have getDigested method than f1.getDigested will not compile
        f1.getDigested();

        f1 =  new Orange ("sour-sweet", "redish",11);
        f1.getDigested();

        System.out.println(f1.toString());

        String str = null;
//         System.out.println(str.charAt(0));
//         System.out.println(str.bark());
//         System.out.println(str.getDigested);

        Fruit f2 = new Apple("crispy", "hot-red", "Gala");

        Fruit f3 = new Orange("sour", "Orange", 12);

        Fruit f4 = new Orange("very sweet", "blood-red", 10);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Fruit [] myFruit = {f1,f2,f3,f4};
        for (Fruit each: myFruit) {
            each.getDigested();
        }

    }
}
