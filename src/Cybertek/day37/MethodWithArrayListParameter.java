package Cybertek.day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Qalbinur");
        nameList.add("Salam-Papalam");
        nameList.add("Sabahiddin");
        nameList.add("Guzelnur");

        printAList(nameList);

        String resultLongest = getLongestElement(nameList);
        System.out.println("Result longest : "+resultLongest);
//        byte myByte = 17;
//        printByte(myByte);
//        int myByte = 100;
//        printByte(myByte);
    }
    public static String getLongestElement(List<String> nameList) {

        String longestName = ""; //nameLst.get(0)
        for (int x = 0; x < nameList.size(); x++) {
            String currentName = nameList.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        return longestName;
    }
    public static void printByte(byte b) {
        System.out.println("You passed byte value : " + b);
    }

    //This method will print out the content of passed List object vertically
    public static void printAList(List<String> lst) {
        for (String each : lst) {
            System.out.println("each = " + each);

        }
    }
}
