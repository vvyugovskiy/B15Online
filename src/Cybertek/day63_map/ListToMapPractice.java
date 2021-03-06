package Cybertek.day63_map;

import java.util.*;

public class ListToMapPractice {

    public static void main(String[] args) {

        /*
        Abraham Hope
        Zeliha Sezer
        Onuralp Dursun
        Tugba Bekar
        Birnigar Ozyurt
        Seda Civan
        Nuran Demir
        Murat Kilinc
        Hakan Durmus
        Mariia Lukianenko
         */

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Onuralp Dursun");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Mariia Lukianenko");

        System.out.println("names = " + names);

        Map<String, Integer> nameCharCountPair = new LinkedHashMap<>();
        for (String eachMember : names) {
            nameCharCountPair.put(eachMember,eachMember.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }
}
