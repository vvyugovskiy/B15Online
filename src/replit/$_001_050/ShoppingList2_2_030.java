package replit.$_001_050;

import java.util.Scanner;

public class ShoppingList2_2_030 {
    public static void main(String[] args) {

        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        String report;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        totalPrice = (count1 * price1) + (count2 * price2) + (count3 * price3);
        report = "";

        if(count1>0&&count2>0&&count3>0){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3);
        }else if(count1>0&&count2>0&&count3<=0){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2);
        }else if(count1>0&&count2<=0&&count3<=0){
            report="Item1: "+item1+" Price: "+(price1*count1);
        }else if(count1>0&&count2<=0&&count3>0){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "+(price3*count3);
        }else if(count1<=0&&count2<=0&&count3>0){
            report="Item3: "+item3+" Price: "+(price3*count3);
        }else if(count1<=0&&count2>0&&count3<=0){
            report="Item2: "+item2+" Price: "+(price2*count2);
        }else{
            report="No items";
        }

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);


    }
}