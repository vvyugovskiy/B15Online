package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String>groceries = Arrays.asList("Eggs","Milk","Butter","Apple","Salmon");
        System.out.println("groceries = " + groceries);
        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet Coke");
        newLst.add("Sugar");
        System.out.println("newLst = " + newLst);

        List<String>newItemsToAdd = Arrays.asList("Pasta","Branzini","Asparagus","Spinach");
        //Adding one List to another List
        newLst.addAll(newItemsToAdd);
        System.out.println("newLst = " + newLst);


    }
}
