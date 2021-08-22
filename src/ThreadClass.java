import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("ThreadClass running");
    }

    public static void main(String[] args) {
//-------------------------------------------------------------------
        ThreadClass thread = new ThreadClass();
//            public void run() {
//                System.out.println("ThreadClass running");
//            }
//        };
//        Thread thread = new Thread(() -> {
//            System.out.println("ThreadClass running");
//        });

//        Runnable runnable = new Runnable() {
//            public void run() {
//                System.out.println("Runnable running");
//            }
//        };

//        Runnable runnable =
//                () -> {
//                    System.out.println("Runnable running");
//                };
//
//        runnable.run();
        thread.start();
//        System.out.println(thread.getName());


    }
}
