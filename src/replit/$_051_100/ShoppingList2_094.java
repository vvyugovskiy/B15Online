package replit.$_051_100;

import java.util.Scanner;

public class ShoppingList2_094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue = scan.next();
            if (countinue.equalsIgnoreCase("yes") && count < 10) {
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            } else {
                shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
            }
            totalProce += price;

            count++;
        } while (countinue.equalsIgnoreCase("yes") && count <= 10);
        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalProce);
    }
}
