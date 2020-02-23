package replit.$_051_100;

import java.util.Scanner;

public class ZombieAttack1_087 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int dayCount = 0;

        while (inhabitants > 0) {
            System.out.println("Day " + (dayCount) + " " + "[" + inhabitants + "]");
            inhabitants = inhabitants / 2;
            dayCount++;
        }
        System.out.println("---- EXTINCT ----");
    }

}