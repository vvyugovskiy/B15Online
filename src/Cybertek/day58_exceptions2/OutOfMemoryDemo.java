package Cybertek.day58_exceptions2;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i > 0 ; i++) {
            System.out.println(i);
            nums.add(i);
        }
    }
}
