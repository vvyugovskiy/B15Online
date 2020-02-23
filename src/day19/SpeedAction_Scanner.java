package day19;

import java.util.Scanner;

public class SpeedAction_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // create 2 int var. Start end end
        // assume start>end
        // create a top loop to stimulate slow increase of the speed/
        // Ex. if starts 10 , end 27 : print 10-27

        System.out.println("Enter The Starting and End Speed : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.print("you have started from speed--> ");
        for (int i = start; i <= end; i++){

            System.out.print(i+",");

        }

    }
}
