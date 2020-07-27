package Cybertek.day22;

public class LopingThroughAnArray {
    public static void main(String[] args) {
        // how do we get size of an array object
        // array object has a property called lenght
        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        //how do we get the size of any array object
        // array object has a property called lenght

        int itemCount = scores.length;
        int lastItemIndex = itemCount - 1;
//        for (int x = 0; x <= lastItemIndex; x++) {
//        for (int x = 0; x <= itemCount-1; x++) {
        for (int x = scores.length-1; x >= 0; --x) {

            System.out.println(scores[x]);
        }
        // how to get a char count of a String
        String name = "Jon Snow";
        int charCount = name.length();
    }
}
