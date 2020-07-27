package Cybertek.day49;

public class IceCream extends Object implements Edible{

    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        i1.digest();
        System.out.println(i1.toString());

        //since Object class exists we can create object out of it
        // Object o1 = new Object();
    }
    @Override
    public void digest (){
        System.out.println("Digest ice cream with love");
    }

    @Override
    public void eat() {
        System.out.println("Eat with spoon!");
    }

    @Override
    public void drink() {
        System.out.println("Drink if it melted");
    }


}
