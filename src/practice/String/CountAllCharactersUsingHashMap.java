package practice.String;

import java.util.HashMap;
import java.util.Map;

public class CountAllCharactersUsingHashMap {

    public static void main(String[] args) {

        countCharacters("Java J2EE Java JSP J2EE");
        eraseWhiteSpaces("Java J2EE Java JSP J2EE");

    }
//-----------------------------------------------------------------------------------------------------------------
    public static void countCharacters (String s){

        Map<Character, Integer> charCountMap = new HashMap<>();
        char [] strArray = s.toCharArray();

        for (int i =0 ; i < strArray.length;i++){
            charCountMap.put(strArray[i],charCountMap.getOrDefault(strArray[i],0)+1);
        }
//        for (char c :strArray ) {
//            if (charCountMap.containsKey(c)){
//                charCountMap.put(c,charCountMap.get(c)+1);
//            }else{
//                charCountMap.put(c,1);
//            }
//        }
        System.out.println(charCountMap);
    }
//--------------------------------------------------------------------------------------------------------------
    public static void eraseWhiteSpaces (String s){
        String result ="";
        for (int i = 0; i < s.length(); i++) {

            // using Character class
            if (!Character.isWhitespace(s.charAt(i))){
                result+=s.charAt(i);
            }
        }
        System.out.println("["+result+"]");

    }
}
