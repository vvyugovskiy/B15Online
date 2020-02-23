package replit.$_201_250;

import java.util.*;

public class MethodsWithArrayList15Search_214 {
    public static String search(ArrayList<String> r, String find) {
        //String result = "";

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)) {
                return r.get(i);
            }
        }
        return "search failed";
    }  //end wineSeller

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");
        String find_tst = search(arr, "foo");
        System.out.print(find_tst);  //foo bar


    }
}
