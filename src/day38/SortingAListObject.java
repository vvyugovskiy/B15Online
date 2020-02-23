package day38;
import java.util.*;
public class SortingAListObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(200,300,700,600,800));

        //2 way to SORT An ArrayList Object
        // Use Collections utility class (just like Arrays utility class for array Object)
        //Collections has many ready methods to work with Collection objects like ArrayList and so on
        Collections.sort(nums);
        System.out.println("Nums after sort = "+nums);
        Collections.sort(nums,Comparator.reverseOrder());
        System.out.println("Nums after reversing = "+nums);
        // List also has sort method that accept one Comparator Object
        //Simple way to get Comparitor object are
            //Comparator.naturalOrder()-->>low to high order
            //Comparator.reverseOrder()-->>high to low order
        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using = nums.sort(Comparator.naturalOrder()) + \n\t" + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using = nums.sort(Comparator.reverseOrder()) + \n\t" + nums);

    }
}
