package replit.$_201_250;
import java.util.*;
public class MethodsWithArrayList16_2Times_215 {
    public static void main(String[] args) {

    }
    //create your method below
public static ArrayList<Integer>twoTimes(ArrayList<Integer> lst){

        ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < lst.size(); i++) {
        arr.add(lst.get(i));
        arr.add(lst.get(i));
    }
    return arr;
}
}
