package Cybertek.day63_map;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        // CREATING HashMap objects

        // Compared to List , Set which store single element per item
        // Map store key-value pair per item
        // That's why we need to data type inside <>
        // one for the key one for the value

        Map<String, String> nameAndStatePair = new HashMap<>();

        Map<Integer, String> groupNumAndNamePair = new HashMap<>();

        Map<String, Double> groceryNameAndPricePair = new HashMap<>();

        Map<String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String, Integer> gameNameAndScoreMap = new HashMap<>();

        Map<Byte, Character> questionNumAndCorrectAnswerPair = new HashMap<>();

    }
}
