package HomeWork;

public class HW_2019_12_10_ARRAY_SHOPPING_03 {
    public static void main(String[] args) {

        String[] fruit = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

// 3, assume that the order of grocery Items match the prices in same order do below:
        for (int x = 0; x < fruit.length; x++) {
            System.out.print(fruit[x] + " Price is " + prices[x] + " ");
        }
        System.out.println();

//  3.1 print first item and first price in one print statement -->>  apple price is 1.99
        for (int x = 0; x < fruit.length; x++) {
            if (x == 0) {
                System.out.println(fruit[x] + " price is " + prices[x]);
            }
        }
// 3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
        for (int x = 0; x < fruit.length; x++) {
            if (x == fruit.length - 1) {
                System.out.println(fruit[x] + " price is " + prices[x]);
            }
        }
// 3.3 print only those items with price more than 3.11
        for (int x = 0; x < fruit.length; x++) {
            if (prices[x] >= 3.11) {
                System.out.println("More than 3.11 : " + fruit[x] + " is " + prices[x]);
            }
        }
// 3.4 print only those items with price more than average
        float sum = 0;
        float average = 0;
        for (int x = 0; x < fruit.length; x++) {
            sum = sum + prices[x];
            average = sum / prices.length;
        }
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] > average) {
                System.out.println("More than Average price: " + prices[x]);
            }
        }
// 3.5 print only those prices of grocery items that contains letter b
        for (int x = 0; x < fruit.length; x++) {
            if (fruit[x].contains("b")){
                System.out.println("Contains 'B' : "+prices[x]);
            }
        }
// 3.6 print the item name with max price
        float max = prices[0];
        for (int x = 0; x < prices.length; x++) {
            if (prices[x]>max){
                max=prices[x];
                System.out.println("Max Price Fruit : "+fruit[x]);
            }
        }
// 3.7 print the item name with min price
        float min = prices[0];
        int minindex;
        for (int x = 0; x < prices.length; x++) {
            if (prices[x]<min){
                min=prices[x];
                minindex = x;
                System.out.println("Min Price Fruit : "+fruit[x]);
            }
        }
    }
}
