package replit.$_151_200;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MethodsWithArrayList3CombineArrays_193 {
    public static String combineRs(String[] r1, String[] r2) {

        ArrayList<String>lst = new ArrayList<>();
            lst.addAll(Arrays.asList(r1));
            lst.addAll(Arrays.asList(r2));
            String result = "";
        for (int i = 0; i < lst.size(); i++) {
            result+=lst.get(i);
        }

        return result;
    }
}
