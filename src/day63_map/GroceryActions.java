package day63_map;

import java.util.HashMap;
import java.util.Map;

public class GroceryActions {

    public static void main(String[] args) {


        Map<String, Double> nameGroceryAndPrice = new HashMap<>();
        nameGroceryAndPrice.put("Tomato", 4.95);  // put
        nameGroceryAndPrice.put("Apple", 5.95);   // put
        nameGroceryAndPrice.put("Carrot", 3.95);  // put
        nameGroceryAndPrice.put("Orange", 5.95);  // put
        nameGroceryAndPrice.put("Apple", 7.25);   // put
        nameGroceryAndPrice.put("Tomato", 7.95);  // put
        nameGroceryAndPrice.put("Nuts", 12.95);   // put
        nameGroceryAndPrice.putIfAbsent("Broccoli", 9.19);
        nameGroceryAndPrice.putIfAbsent("Apple", 100.0);

        System.out.println("Map size : " + nameGroceryAndPrice.size());
        System.out.println("Map : " + nameGroceryAndPrice);  // NO ORDER WHEN PRINTING (RANDOM ORDER)

        // nameGroceryAndPrice.replace("Carrot",3.95*2);
        nameGroceryAndPrice.replace("Carrot", nameGroceryAndPrice.get("Carrot") * 2);
//        double newPrice = nameGroceryAndPrice.get("Carrot") * 2; // get the Carrot price and double it
//        nameGroceryAndPrice.replace("Carrot",newPrice);
        System.out.println("nameGroceryAndPrice.get(\"Carrot\") = " + nameGroceryAndPrice.get("Carrot"));

        // reduce the price of broccoli by $1
        nameGroceryAndPrice.replace("Broccoli", nameGroceryAndPrice.get("Broccoli") - 1);
        System.out.println("REMOVED $1 FROM BROCCOLI = " + nameGroceryAndPrice);

        // IF WE HAVE TOMATO IN THE MAP -->> DELETE IT
        if (nameGroceryAndPrice.containsKey("Tomato")) {
            nameGroceryAndPrice.remove("Tomato");
            System.out.println("NO MORE TOMATO");
        }
        System.out.println("After Tomato remove = " + nameGroceryAndPrice);

        nameGroceryAndPrice.replace("Orange", 5.95 / 2);
        System.out.println(nameGroceryAndPrice.get("Orange"));

    }
}
