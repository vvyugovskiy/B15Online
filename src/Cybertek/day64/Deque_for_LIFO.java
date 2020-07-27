package Cybertek.day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        // How do we implement a LifoQueue if not using old class called Stack
        // we can use any of Deque interface implementation
        // Deque is a double ended Queue so we can add item as always
        // and when we remove we can use removeLast last method to achieve Last in first out

        Deque<String> lifoQou = new LinkedList<>();
        lifoQou.add("review the class");
        lifoQou.add("do your homework");
        lifoQou.add("attend the class");
        lifoQou.add("Say bye to Java");

        System.out.println("lifoQou.removeLast() = " + lifoQou.removeLast());
        System.out.println("lifoQou.removeLast() = " + lifoQou.removeLast());
        System.out.println("lifoQou.removeLast() = " + lifoQou.removeLast());
        System.out.println("lifoQou.removeLast() = " + lifoQou.removeLast());

        System.out.println(lifoQou);
    }
}
