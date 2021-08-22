package practice;

import java.util.Scanner;

public class la {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        String dogMessage = scan.nextLine();
//        System.out.println(dogMessage.indexOf("dog"));
//        String newDogMessage = dogMessage.replaceAll("dog"," ");
//        System.out.println(newDogMessage);
//        System.out.println(dogMessage.substring(dogMessage.indexOf("dog")+3));
//        System.out.println(makeBricks(3,2,9));
        System.out.println(makeBricks(3, 2, 8));

    }

    public static boolean makeBricks(int small, int big, int goal) {

        if (big >= goal / 5 && small >= goal % 5) {
            return true;
        } else if (goal - big * 5 <= small && goal - big * 5 > 0) {
            return true;
        }

        return false;
    }

}
