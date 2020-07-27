package Cybertek.day19;

import java.util.Scanner;

public class SpeedUpOrSlowDown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // create 2 int var. Start end end
        // assume start>end
        // create a top loop to stimulate slow increase of the speed/
        // Ex. if starts 10 , end 27 : print 10-27

        System.out.println("Enter The Starting and End Speed : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        // System.out.print("you have started from speed--> ");
        if (start < end) {
            System.out.println("Increasing The SPEED ");
            // increase the speed till i reach the ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        } else if (start > end) {
            System.out.print("Decreasing The SPEED ");
            //i will decrease the speed till i reach ending speed
            for (int x = start; x >= end; x--) {
                System.out.print(x + ",");
            }
        } else {
            System.out.println("No action needed Same Speed");
        }
    }
}
