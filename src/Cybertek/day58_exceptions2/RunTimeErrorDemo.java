package Cybertek.day58_exceptions2;

public class RunTimeErrorDemo {

    static int num = 1239000;

    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        // call main method
        main(null);
    }

}
