package day37;

import java.util.ArrayList;
import java.util.*;
public class TeamMateListPractice {
    public static void main(String[] args) {

        ArrayList<String> teamMates = new ArrayList<>();
        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasil");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");
        teamMates.add("Support Team");

        System.out.println(teamMates);
        // First Item
        System.out.println(teamMates.get(0));
        //Last Index
        System.out.println(teamMates.get(teamMates.size() - 1));
        //Print One by One
        System.out.println("\nALL ITEMS");
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("\tItem "+(i+1)+" = "+teamMates.get(i));
        }
        // All mates in reversed order
        System.out.println("\nAll Mates In Reversed order");
        for (int i = teamMates.size() - 1; i >= 0; i--) {
            System.out.println("\tItem "+(i+1)+" = "+teamMates.get(i));
        }
        // Print 2 items at a time
        System.out.println("\nPrint two items at a time");
        for (int i = 0; i <= teamMates.size() - 2; i ++) {
            System.out.println("\t"+teamMates.get(i) + "---" + teamMates.get(i + 1));
        }
        // Print 2 items at a same time
        System.out.println("\nPrint two items without repeating");
        for (int i = 0; i <= teamMates.size() - 2; i +=2) {
            System.out.println("\t"+teamMates.get(i) + "---" + teamMates.get(i + 1));
        }
        // Concat every Item with "-" in between
        System.out.println("\nConcatenate every item with \"-\" in between");
        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {
            if (!(i==teamMates.size()-1)){
            result+=teamMates.get(i) + "-";
            }
        }
        result+=teamMates.get(teamMates.size()-1);
        System.out.println("\tResult : "+result);
        //TODO: How can we turn a List into a String and store it ? And manipulate
        String lstToString = teamMates.toString();
        System.out.println(lstToString.substring(1,lstToString.length()-1).replace(", ","-"));
    }
}
