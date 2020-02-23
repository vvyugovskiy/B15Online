package replit.$_001_050;

import java.util.Scanner;

public class BurgerOrChicken_050 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();

        float price = 0f;

        if (in.equals("burger") || in.equals("chicken")){
            System.out.println(in);
            price +=10.0;
            System.out.println(price);
        }else if (in.equals("soda")){
            System.out.println(in);
            price+=2.0;
            System.out.println(price);
        }

    }
}
