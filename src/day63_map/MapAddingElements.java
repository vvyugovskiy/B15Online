package day63_map;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {

    public static void main(String[] args) {

        // Creating HashMap object

        Map<String, Integer> nameAgePair = new HashMap<>();

        // adding elements : put

        nameAgePair.put("Zehra", 6);
        nameAgePair.put("Muhammed", 21);
        nameAgePair.put("Maya", 27);
        nameAgePair.put("Aidar", 20);
        nameAgePair.put("Fatih", 27);
        nameAgePair.put("Roxana", 16);

        // The keys of the Map is unique ,it does not accept duplicate
        // here since we already have Zehra --> it will just replace the old value with new one
        // overrides age VALUE OF ZAHRA
        nameAgePair.put("Zehra", 7);

        // HOW DO I ONLY ADD NEW ITEMS IF IT DOES NOT ALREADY EXISTS (java 8 addition)
        nameAgePair.putIfAbsent("Zehra", 10); // add's ONLY IF DOES NOT HAVE THE KEY

        System.out.println("nameAgePair = " + nameAgePair);
        // GET THE SIZE OF THE MAP
        System.out.println("GETTING A SIZE OF A MAP : " + nameAgePair.size());

        // GETTING A VALUE USING THE KEY
        System.out.println(nameAgePair.get("Roxana"));

        // PRINTS overridden age VALUE OF ZAHRA
        System.out.println("Zehra's age = " + nameAgePair.get("Zehra"));

        // HOW TO CHECK IF A KEY ALREADY EXIST OR NOT?
        // containsKey METHOD
        System.out.println("nameAgePair.containsKey(\"Roxana\") = " + nameAgePair.containsKey("Roxana"));
        System.out.println("nameAgePair.containsKey(\"HASAN\") = " + nameAgePair.containsKey("HASAN"));

        // UPDATING THE ELEMENT IN THE MAP USING REPLACE
        nameAgePair.replace("Maya", 17);
        System.out.println("nameAgePair.get(\"Maya\") = " + nameAgePair.get("Maya"));
        // why don't we just use put ?? what is the downside ?
        // If I don't have that key , it will just add new one and that's not what we want , we only want to update!!!

        // updating the value only if the old value equals to a specified value
        // update Zehra's age to 9 if it was 17
        nameAgePair.replace("Zehra", 7, 10);
        System.out.println("ZnameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

        // Removing Entry  by the key
        nameAgePair.remove("Fatih");
        // try not to use get method to check you have the entry or not
        // because if you don't have the key you will get null
        // but you will also get null if the value was actually null -- {Fatih=Null}
        System.out.println(nameAgePair.get("Fatih"));   // better use containsKey
        System.out.println(nameAgePair.containsKey("Fatih"));

    }
}
