package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryActions {

    public static void main(String[] args) {


        Map<String, Double> nameGroceryAndPrice = new HashMap<>();
        nameGroceryAndPrice.put("Tomato", 4.95);
        nameGroceryAndPrice.put("Apple", 5.95);
        nameGroceryAndPrice.put("Carrot", 3.95);
        nameGroceryAndPrice.put("Orange", 5.95);
        nameGroceryAndPrice.put("Apple", 7.25);
        nameGroceryAndPrice.put("Tomato", 7.95);
        nameGroceryAndPrice.put("Nuts", 12.95);
        nameGroceryAndPrice.putIfAbsent("Broccoli",9.19);
        nameGroceryAndPrice.putIfAbsent("Apple",7.15);

        System.out.println("Map : " + nameGroceryAndPrice);
        System.out.println("Map size : " + nameGroceryAndPrice.size());
        //nameGroceryAndPrice.replace("Carrot",3.95*2);
        double newPrice = nameGroceryAndPrice.get("Carrot")*2;
        System.out.println(nameGroceryAndPrice.get("Carrot"));
        nameGroceryAndPrice.replace("Orange",5.95/2);
        System.out.println(nameGroceryAndPrice.get("Orange"));

    }
}
