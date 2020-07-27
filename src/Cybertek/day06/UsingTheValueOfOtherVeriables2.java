package Cybertek.day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVeriables2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Your order is ");
        String yourOrder =input.nextLine();
        System.out.println("My order is  ");
        String myOrder = yourOrder;

        System.out.println("My order is : "+yourOrder);




    }
}
