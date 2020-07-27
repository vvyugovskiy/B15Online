package Cybertek.day37;

import java.util.ArrayList;

public class PriceListUpdateValuePractice {
    public static void main(String[] args) {

        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);
        System.out.println("Price List : \n\t" + priceList);
        // change the 3rd price to 10$
        priceList.set(2, 10D);
        System.out.println("Third item new price = \n\t" + priceList);
        // Add 4 dollars to first Price
        priceList.set(0, priceList.get(0) + 4);
        System.out.println("First item new price = \n\t" + priceList);
        // change last price to sum of first and second price
        priceList.set(priceList.size() - 1, priceList.get(0) + priceList.get(1));
        System.out.println("Last item new price = \n\t" + priceList);
        // give 40% off to second price
        priceList.set(1, priceList.get(1) * 0.6);
        System.out.println("Second price after 40% Off = \n\t" + priceList);
        //Double the value of each and every Price In The List
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i,priceList.get(i)*2);
//            double newValue = priceList.get(i) * 2;
//            priceList.set(i, newValue);
        }
        System.out.println("After Doubling every price = \n\t"+priceList);
        // cut the price in half if it is more than 20$
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i)>=20){
                priceList.set(i,priceList.get(i)/2);
            }
//            double eachPrice = priceList.get(i);
//            if (eachPrice >= 20) {
//                priceList.set(i, eachPrice / 2);
//            }
        }
        System.out.println("Price after dividing if over $20 = \n\t"+priceList);
        // SWAP First snd Last Values
        int lastIndex = priceList.size() - 1;
        Double temp = priceList.get(0);          // store the first value in temp so we can assign it to the last later
        priceList.set(0, priceList.get(lastIndex)); // assign the last value to the first index
        priceList.set(lastIndex, temp);             // assign the saved first value into the last index
        System.out.println("Prices after Swapping = \n\t"+priceList);
        //  slightly ore simplified version of above code
        Double firstItem = priceList.get(0);
        Double lastItem = priceList.get(lastIndex);
        Double temp1 = firstItem;
        priceList.set(0, lastItem);
        priceList.set(lastIndex, temp1);
        System.out.println("PriceList after swapping back : \n\t" + priceList);
    }
}
