import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class practice {

    public static void main(String[] args) {

        HashSet h = new HashSet(); // comes from java.util.HashSet;
//-----------------------------------------------------------------
        String a = "interned String";
        String b = new String ("interned String");
        String c = b.intern();
        System.out.println(a==c); //==> true
        System.out.println(a==b); //==> false
//--------------------------------------------------------------------------------------------
        String s = "age: 47 ";
        s=s.replaceAll("\\D+","");  // ==> String 47
        System.out.println(s);
        int s1 = Integer.parseInt(s);
        System.out.println(s1); // ==> int 47

        String n = "Hello im 12th in line";
        n=n.replaceAll("[a-zA-Z]","").trim(); // replaces all letters with "" but lives spaces
        System.out.println(n);
        int n1 = Integer.parseInt(n); // turn String 12 into int 12
        System.out.println(">"+n1+"<"); // to make sure there is no spaces presented

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,17,67,12,765,1,90,12));
        nums.removeAll(Arrays.asList(12));
        System.out.println(nums);


    }
}
