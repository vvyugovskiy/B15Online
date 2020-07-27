package Cybertek.day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "Female");
        employeeMap.put("Winfred", "Male");
        employeeMap.put("Jereme", "Male");
        employeeMap.put("Glad", "Female");
        employeeMap.put("Desirae", "Female");
        employeeMap.put("Kakalina", "Female");
        employeeMap.put("Bertrando", "Male");
        employeeMap.put("Ajay", "Female");
        employeeMap.put("Brigitte", "Female");
        employeeMap.put("Derk", "Male");
        employeeMap.put("Orlando", "Male");
        employeeMap.put("Selle", "Female");
        employeeMap.put("Marika", "Female");
        employeeMap.put("Griffy", "Male");
        employeeMap.put("Shanon", "Female");
        employeeMap.put("Clerkclaude", "Male");
        employeeMap.put("Rickard", "Male");
        employeeMap.put("Job", "Male");
        employeeMap.put("Aida", "Female");
        employeeMap.put("Alonzo", "Male");

        System.out.println(employeeMap);

        Set<Map.Entry<String,String>> entryView = employeeMap.entrySet();
        // print out all Females
        for (Map.Entry<String,String> each :entryView ) {
            if (each.getValue().equals("Female")){

                System.out.println(each.getKey());
            }
        }
        System.out.println(entryView.size());
        // Update Females to Queen, Male to King
        for (Map.Entry<String,String> each :entryView ) {
            if (each.getValue().equals("Female")){
                each.setValue("Queen");
                //System.out.println(each.getKey());
            }else{
                each.setValue("KING");
            }
        }
        System.out.println(employeeMap);
    }
}
