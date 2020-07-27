package Cybertek.day18;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {
        // keep asking for 5$ or 20$ until you get them
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 or 20 $ Dad");
        int x = scan.nextInt();

        // if the bill is not 5 dallar and not 20
        // or nagate the result of its 5 or 20
        // ! (x==5 \\ x==20)

        while (!(x == 5 || x == 20)) {

            System.out.println("Not what im asking for Dad");
            System.out.println("Give me 5 or 20");
            x=scan.nextInt();
        }
        System.out.println("Great");
    }
}

