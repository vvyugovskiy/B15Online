package Cybertek.day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static void main(String[] args) {

        // create a list of 6 Doubles in a short way
        List<Double> prices = Arrays.asList(2.6, 17.6, 69.0, 99.0, 0.99, 7.0);

       int count =0;
        for (Double each :prices) {
            if (each>5){
                ++count;
            }
        }
        System.out.println("count = "+count);

        List<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);
        System.out.println("topicsCopy = " + newPrices);

        //Create an ArrayList Object in one shot with many items so we can add or remove

        ArrayList<Double> oneShotPrice
                = new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));
        System.out.println("oneShotPrice Before = " + oneShotPrice);
        //Add 100.99 after 9.99
        oneShotPrice.add(1,100.99);
        //remove item 3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice After = " + oneShotPrice);
    }
}
