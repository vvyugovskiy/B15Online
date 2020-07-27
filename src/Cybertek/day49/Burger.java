package Cybertek.day49;

// a CLASS can ONLY extend another class
// a class can implement multiple interfaces
public class Burger implements Edible, Juicy{

//    public static final boolean IS_HUMAN_FOOD = true ;
//    public Burger(){
//        super();
//    }

    @Override
    public void eat(){
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink(){
        System.out.println("Eat burger then drink some coffee");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
