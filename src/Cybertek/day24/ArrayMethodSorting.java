package Cybertek.day24;

import java.util.Arrays;

public class ArrayMethodSorting {
    public static void main(String[] args) {

        int[] scores = {99, 44, 66, 23, 19, 55};
        System.out.println("ORIGINAL 1 INDEX : " + scores[0]);
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("1St Index After SORT : " + scores[0]);

        System.out.println("++++++++++++++++++String Sorting+++++++++++++++++++");
        String[] supers = {"Superman", "Batman", "Wonder Woman", "Aquamen", "Cyborg", "Flash", "100", "9"};
        // ONLY First Characters matter when sorting a string Array
        System.out.println("Before sorting : " + Arrays.toString(supers));
        Arrays.sort(supers);
        System.out.println("After Sorting : " + Arrays.toString(supers));
        System.out.println("+++++++++++++Boolean Sorting+++++++++++++++++");  // SORT DOES NOT WORK FOR BOOLEAN
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        // Arrays.sort(fiveSwitchOnOffs);      SORT DOES NOT WORK FOR BOOLEAN
        //    Arrays.sort(arrObject)   DOES NOT RETURN A VALUE THAT WE CAN STORE
        // IT ONLY TAKES ACTION to reshuffle the  the index of Original array object to keep it in sorted Order


    }
}
