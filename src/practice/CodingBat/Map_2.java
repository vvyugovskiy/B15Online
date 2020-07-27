package practice.CodingBat;

import java.util.*;

public class Map_2 {

    public static void main(String[] args) {


        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));

        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        System.out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));

        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"easy", "does", "it", "every", "ice", "eaten"})));

    }
//-------------------------------------------------------------------------------------------------------------------

    public static String wordAppend(String[] strings) {

        String result = "";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (!map.containsKey(strings[i])) {
                map.put(strings[i], 1);
            } else {
                map.put(strings[i], map.get(strings[i]) + 1);
                if (map.get(strings[i]) % 2 == 0) {
                    result += strings[i];
                }
            }
        }
        return result;
    }
//-------------------------------------------------------------------------------------------------------------------

    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }

    //-------------------------------------------------------------------------------------------------------------------
    public static String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].charAt(0) + "";
            if (!map.containsKey(key)) {  // store index and key
                map.put(key, i);

            } else { // SWAP values/ indexes
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;

                map.remove(key); // remove the key so we can reuse it
            }
        }
        return strings;
    }
//-------------------------------------------------------------------------------------------------------------------

    public static String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i].charAt(0) + "";

            if (!map.containsKey(key)) {
                map.put(key, i);
            } else if (map.containsKey(key) && map.get(key) == 69) {
                continue;
            } else {

                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;

                map.put(key, 69);
            }
        }
        return strings;
    }

//-------------------------------------------------------------------------------------------------------------------

    public static boolean cigarParty(int cigars, boolean isWeekend) {


        if (isWeekend == true) {
            return cigars > 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
//-------------------------------------------------------------------------------------------------------------------

}
