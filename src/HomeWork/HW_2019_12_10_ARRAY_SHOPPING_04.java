package HomeWork;

import java.util.Arrays;

public class HW_2019_12_10_ARRAY_SHOPPING_04 {
    public static void main(String[] args) {

        String[] fruit = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

// 4 , Below tasks will modify array :  (for each loop should not be used, try and see why)

// 4.1 swap the value of first item in array with last item of array , swap apple with kiwi
        String temp = fruit[0];
        fruit[0] = fruit[5];
        fruit[5] = temp;
        System.out.println(Arrays.toString(fruit));
// 4.2 use for loop to loop through your groceryItems array and modify your items like this :
//        itemValue+itemCharacterCount
//        For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
        System.out.println();
        for (int x = 0; x < fruit.length; x++) {
            System.out.println("itemValue : " + fruit[x] + " characters :" + fruit[x].length());
        }
// 4.3 increase the value of each prices by one  in prices array
        for (int x = 0; x < prices.length; x++) {
            prices[x] = prices[x] + 1;
        }
        System.out.println(Arrays.toString(prices));
// 4.4 double the value of each prices in your array 1.99-->> 1.99*2
        for (int x = 0; x < prices.length; x++) {
            prices[x] = prices[x] * 2;
        }
        System.out.println("Increasing 2X : " + Arrays.toString(prices));
// 4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] < 1.99) {
                prices[x] = prices[x] * 3;
                System.out.println("Increasing 3X : " + prices[x]);
            }
        }
// 4.6 now find out highest price after the modification
        System.out.println(Arrays.toString(prices));
        float highest = prices[0];
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] > highest) {
                highest = prices[x];
            }
        }
        System.out.println("Highest price : " + highest);
// 4.7 find out the most expensive item name. (edited)
        highest = prices[0];
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] > highest) {
                highest = prices[x];
                System.out.println("Highest price : " + highest + " is : " + fruit[x]);
            }
        }
    }
}
