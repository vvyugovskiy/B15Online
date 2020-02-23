package day64;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        // What if we want to have multiple value for one key ???
        // key data type is String, value data type is List<String>
        Map<String, List<String>> groupMap = new LinkedHashMap<>();
        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("Achievers", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("BugHunter", Arrays.asList("Ayse", "Rabiyam", "Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona", "Fariza", "Seyma", "Sumeyyra", "Huvayda"));

        // System.out.println("groupMap = " + groupMap);

        groupMap.forEach((groupCode, allMembers) -> System.out.println("groupCode = " + groupCode + "\n\t members : " + allMembers));
        // get Toyly, at index 3
        System.out.println(groupMap.get("Achievers").get(3));
        // check if map haz Gulzina of not in Bughunter?
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        // we want to add a new group entry
        groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Superman","Batman","WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));

        // the key for the Map should be a type Immutable

    }
}
