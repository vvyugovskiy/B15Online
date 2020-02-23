package replit.$_201_250;
import java.util.*;
public class MethodsWithArrayList12RepeatAll_206 {
    public static void main(String[] args) {

        ArrayList<Boolean> lst = new ArrayList<>();
        lst.add(true);
        lst.add(false);
        lst.add(false);
        lst.addAll(lst);
        System.out.println(lst);
    }
    //create your method below
//    public static void repeatAL (ArrayList<Boolean> lst){
//        for (Boolean each: lst) {
//            lst.add(each);
//
//        }
//    }
}
