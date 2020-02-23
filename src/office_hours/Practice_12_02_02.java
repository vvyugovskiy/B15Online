package office_hours;

import java.util.Scanner;

public class Practice_12_02_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        // getting every character using charAt(index)
        // generate sequential number 0 -->10

        // is there any chance that while loop does not execute
        int x = 0;
        while (x<name.length()){
            // System.out.println(name.charAt(x));

            System.out.println("index : "+x+"  "+name.charAt(x));
            ++x;
        }

    }
}
