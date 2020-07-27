package practice.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args) {

        findDups("Java J2EE Java JSP J2EE");
    }

    public static void findDups(String s) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Set<Character> charInString = charCountMap.keySet();
        System.out.println("Duplicates Characters in :: " + s);
        for (Character ch : charInString) {
            if (charCountMap.get(ch)>1){
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
    }
}
