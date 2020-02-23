package replit.$_151_200;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Methods12TimeConversion_157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] s24 = s.split(":");

        int s24i;
        if (s.contains("PM")) {
            s24i = Integer.parseInt(s24[0])+12;
           // s24i = s24i + 12;
            s24[0] = String.valueOf(s24i);
        }else if(s.contains("AM")){
            s24i = +Integer.parseInt(s24[0]);
        }

        s24[2] = s24[2].substring(0, 2);

        System.out.println(s24[0] + ":" + s24[1] + ":" + s24[2]);
    }

}
