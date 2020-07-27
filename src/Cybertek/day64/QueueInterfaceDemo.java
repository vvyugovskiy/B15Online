package Cybertek.day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        Queue<String> taskOueue = new LinkedList<>();
        taskOueue.add("review the class");
        taskOueue.add("do your homework");
        taskOueue.add("attend the class");
        taskOueue.add("Say bye to Java");
        taskOueue.add("Say bye to Java");

        System.out.println("taskOueue = " + taskOueue);

        System.out.println("taskOueue = " + taskOueue.remove());
        System.out.println("taskOueue = " + taskOueue.remove());
        System.out.println("taskOueue = " + taskOueue.remove());
        System.out.println("taskOueue = " + taskOueue.remove());
        System.out.println("taskOueue = " + taskOueue.remove());
        System.out.println("taskOueue = " + taskOueue);


    }
}
