package stringMethods;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type anything : ");
        String name = scan.nextLine();

        if (name.length() > 2) {
            System.out.println(name.substring(0, 2));
        } else if (name.isEmpty()) {
            System.out.println("Empty String");
        }else {
          System.out.println(name.substring(0,1)+name.substring(0,1));
           // System.out.println(""+name.charAt(0)+name.charAt(0));
        }

    }
}
