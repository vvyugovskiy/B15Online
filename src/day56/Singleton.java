package day56;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("We already have this object");
        }
        return instance;
    }

    private Singleton() {
        System.out.println("NO ARG CONSTRUCTOR BEING CALLED!!!");
    }
}
