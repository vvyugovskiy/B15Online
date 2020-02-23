package replit.$_201_250;
import java.util.*;
public class MethodsWithArrayList10AppendPosSum_201 {
    public static void main(String[] args) {
        //Create a static method that:
        //    is called appendPosSum
        //    returns an ArrayList of Integers
        //    takes one parameter: an ArrayList of Integers
        //This method should:
        //    Create a new ArrayList of Integers
        //    Add only the positive Integers to the new ArrayList
        //    Sum the positive Integers in the new ArrayList and add the Sum as the last element
        //For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
    }
    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> lst) {

        ArrayList<Integer> lst2 = new ArrayList<>();
        int sum = 0;
        for (int each : lst) {
            if (each > 0) {
                lst2.add(each);
                sum += each;
            }
        }
        lst2.add(sum);
        return lst2;
    }
}
