package Cybertek.day49;

public interface Chargable {

    public default void charge(){
        System.out.println("DEFAULT charge");
    }
}
