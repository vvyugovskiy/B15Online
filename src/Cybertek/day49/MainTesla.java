package Cybertek.day49;

public class MainTesla {

    public static void main(String[] args) {

        Tesla t1 = new Tesla(2019,518,"Model S");
        t1.selfDrive();
        t1.start();
        t1.goForward();
        t1.charge();

        System.out.println(t1.toString());

    }
}
