package replit.$_001_050;

import java.util.Scanner;

public class VendingMachine_034 {
    public static void main(String[] args) {

        int itemPrice, quarters, dimes, nickels;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        itemPrice = object.nextInt();
        quarters = (100-itemPrice)/25;
        dimes=((100-itemPrice)%25)/10;
        nickels=(((100-itemPrice)%25)%10)/5;

        if (itemPrice >=25 && itemPrice <=100 && (itemPrice%5==0) ) {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");
        }else if (itemPrice <25 || itemPrice >100 || (itemPrice%5!=0)){
            System.out.println("Invalid price!");
        }
     //   if (); {
           // System.out.println("Invalid price!");

       // if (itemPrice%5!=0){
           // System.out.println("Invalid price!");
       // }




    }
}
