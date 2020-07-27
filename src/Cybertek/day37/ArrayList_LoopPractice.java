package Cybertek.day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Qalbinur");
        nameList.add("Salam-Papalam");
        nameList.add("Sabahiddin");
        nameList.add("Guzelnur");
        nameList.add("Muyesser");
        nameList.add("Mustafa");
        System.out.println(nameList);
        //FIND LONGEST NAME
        // Assuming the first name is the longest one we compere
        String longestName = ""; // nameList.get(0)
        for (int i = 0; i < nameList.size(); i++) {
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            String currentName = nameList.get(i);
            if (currentName.length() > longestName.length()) {
                longestName = currentName;
            }
        }
        //System.out.println("longestName = " + longestName);

        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word , and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).length() == longestName.length()) {
                System.out.println("Longest word : "+nameList.get(i));
            }
        }
        // length     :  counting the elements inside array , it's a property of array object
        // last element of an array :  arr[arr.length-1]
        // length()   :  counting the characters inside String , it's a method of String object
        // last char of a String :  str.charAt( str.length() -1 )
        // size()     :  counting the elements inside ArrayList object, , it's a method of List Object
        // last element of an arrayList :  lst.get( lst.size()-1 )

        // HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS
        System.out.println("-------------------");
        for (String currentName : nameList) {
            System.out.println("currentName = " + currentName);
        }
    }
}
