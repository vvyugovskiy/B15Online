package Cybertek.day06;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);

        double regularPrice;
        double discountPR;
        double salePrice ;

        System.out.println("What is the price of your item ? : ");  // it will only pick up first word
        regularPrice = price.nextDouble();
        System.out.println("What is the discount % ? : ");
        discountPR = price.nextDouble();
        salePrice = regularPrice*(1-(discountPR/100));
        System.out.println("With the price : "+regularPrice+" And a Discount of : " +discountPR+ " Your Final price would be :" +salePrice);

    }
}
