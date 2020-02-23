package day24;

import java.util.Arrays;

public class StringOutOfDouble {
    public static void main(String[] args) {

        // create a double array of 3 items
        // get a String out of it
        // save it String to pricesString
        // print each and every character in this String in this format
        // character at index 1 is : yourCharacterHere
        // and so on

        double[] prices = {2.99, 17.56, 7.15};
        System.out.println(Arrays.toString(prices));
        String pricesString = Arrays.toString(prices);
        // we are looping over a String from 1-last one
        for (int x = 0; x < pricesString.length(); x++) {

            System.out.println("Character :" + x + " : " + pricesString.charAt(x));
        }
    }
}
