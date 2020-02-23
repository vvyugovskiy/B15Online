package day05;

import java.util.Scanner;

public class GreceryShopping {
    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);

        System.out.println("What is the price for potato per pound ? ");
        double potatoP = price.nextDouble();
        System.out.println("How many pounds of potatoes do you want to buy ? ");
        int potatoCount = price.nextInt();
        double potatoPrice = potatoP*potatoCount;
        System.out.println("Your potato price would be :" + potatoPrice);

        System.out.println("What is the price of tomatoes per pound ? ");
        double tomatoP = price.nextDouble();
        System.out.println("How many pounds of tomatoes do you want to purchase ? ");
        int tomatoeCount = price.nextInt();
        double tomatoePrice = tomatoP*tomatoeCount;
        System.out.println("Your tomatoe price would be : " + tomatoePrice );

        System.out.println("What is the price of bananas per pound ? ");
        double bananasP = price.nextDouble();
        System.out.println("How many pounds of bananas do you want to buy ? ");
        int bananasCount = price.nextInt();
        double banPrice = bananasP*bananasCount;
        System.out.println("Your bananas price would be : " + banPrice);

        double spend = banPrice+tomatoePrice+potatoPrice;
        System.out.println("Today we lost "+ spend + " $ in grocery shopping");




    }
}
