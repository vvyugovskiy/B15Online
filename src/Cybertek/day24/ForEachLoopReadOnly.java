package Cybertek.day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber=299;
        System.out.println(yourFavNumber);
        long [] nums ={10,40,20};
        // how do i change double my 1St item in the array
        for (int x = 0; x < 3; x++) {
            long eachItem = nums [x];
            eachItem=100;
            // nums[x]=nums[x]*2;             // if we want to exchange the final value
        }
        for (long eachItem : nums) {
            eachItem=100;
        }
        // NEVER USE EACH ITEM LOOP TO MODIFY ARRAY ITEMS
        //  how do i know array items are modified or not? - !REPRINT!

        System.out.println("AFTER WE EXCHANGE THE VALUE");
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }

    }
}
