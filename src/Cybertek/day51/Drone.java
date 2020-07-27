package Cybertek.day51;

public class Drone implements UprigthFlyable{

    @Override
    public void flyUpright() {
        System.out.println("Flying upright");
    }

    @Override
    public void fly() {
        System.out.println("Flying All Over The World");
    }
}
