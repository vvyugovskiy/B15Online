package practice.Array;

import java.util.HashMap;
import java.util.Map;

public class qwe {

    public static void main(String[] args) {


        String[] arr = {"this", "and", "this", ""};
        String[] arr1 = {"salt", "tea", "soda", "toast"};
        String[] arr2 = {"a", "b", "b", "b", "a", "c", "a", "a"};

//        System.out.println(wordCount(arr));
//        System.out.println(firstChar(arr1));
        System.out.println(wordAppend(arr2));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public static Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (String s : strings) {

            String key = s.charAt(0) + "";
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + s);
            } else {
                map.put(key, s);
            }
        }
        return map;
    }

    //   {"a", "b", "b", "b", "a", "c", "a", "a"}
    public static String wordAppend(String[] strings) {

        String result = "";

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i];

            if (!map.containsKey(key)){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
                if (map.get(key)%2==0){
                    result+=key;
                }
            }
        }

        return result;
    }

}
