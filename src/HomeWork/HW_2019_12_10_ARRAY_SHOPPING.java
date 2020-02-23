package HomeWork;

public class HW_2019_12_10_ARRAY_SHOPPING {
    public static void main(String[] args) {

//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }
//        assume that the order of grocery Items match the prices in same order.

        String[] fruit = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
//1, loop through each grocery items and print them in one line
        for (int x = 0; x < fruit.length; x++) {
            System.out.print(fruit[x]);
        }
        System.out.println();
//1.1 print each items at odd index
        for (int x = 0; x < fruit.length; x++) {
            if (x % 2 != 0) {
                System.out.print("Odd indexes : " + x + " : " + fruit[x] + " : ");
            }
        }
        System.out.println();
// 1.2 print all items in reverse order
        for (int x = fruit.length - 1; x >= 0; x--) {
            System.out.print("Reverse Fruit : " + fruit[x] + " ");
        }
        System.out.println();
//1.3 find out the index location of strawberry
        for (int x = 0; x < fruit.length; x++) {
            if (fruit[x].equalsIgnoreCase("strawberry")) {
                System.out.print("Index of Strawberry : " + x);
            }
        }
        System.out.println();
// 1.4 find out the count of groceries that contains berry in the name
        int countBerry = 0;
        for (int x = 0; x < fruit.length; x++) {
            if (fruit[x].contains("berry")) {
                countBerry++;
            }
        }
        System.out.println("Contains BERRY : " + countBerry);
//  1.5 print out all the character counts of the grocery items
        for (int x = 0; x < fruit.length; x++) {
            System.out.println("Fruit : " + fruit[x] + " : Contains : " + fruit[x].length() + " : characters");
        }
        //1.6 print out only those items with even character count
        for (int x = 0; x < fruit.length; x++) {
            if (fruit[x].length() % 2 == 0) {
                System.out.println(fruit[x]);
            }
        }
//1.7 print out only those items end with letter e
        for (int x = 0; x < fruit.length; x++) {
            if (fruit[x].endsWith("e")) {
                System.out.println("Ends With E : " + fruit[x]);
            }
        }
// 1.8 print out only last 3 characters of all the items
        for (int x = 0; x < fruit.length; x++) {
            System.out.println("Last 3 : " + fruit[x].substring(fruit[x].length() - 3));

        }
        for (String eachFruit : fruit) {
            String last3=""+eachFruit.charAt(eachFruit.length()-3)+   eachFruit.charAt(eachFruit.length()-2)+eachFruit.charAt(eachFruit.length()-1);
            System.out.println("Last 3 CHAR's : "+last3);
        }

// 1.9 create String variable called allItems and store all the items inside array separated by comma.
        String allItems = "";
        for (int x = 0; x < fruit.length; x++) {
            allItems += (fruit[x] + ", ");
        }
        System.out.println("String of fruits : " + allItems);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

// 2, loop through each prices  and print them in one line
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        for (int x = 0; x < prices.length; x++) {
            System.out.print("Price : " + prices[x] + " ");
        }
        System.out.println();

// 2.1 print each prices in even index
        for (int x = 0; x < prices.length; x++) {
            if (x % 2 == 0) {                                    // Even index Prices
                System.out.print("Even Index : " + x + " : " + prices[x] + " ");
            }
        }
        System.out.println();
// 2.2 print only prices less that 3 dollars
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] < 3) {
                System.out.println("Less than 3$ : " + prices[x]);
            }
        }
// 2.3 print the sum of all the prices and get average
        float sum = 0;
        for (int x = 0; x < prices.length; x++) {
            sum = sum + prices[x];
        }
        System.out.println("SUM of Prices : " + sum);

        System.out.println("Average Price : " + sum / prices.length);

// 2.4 print only prices more than average price
        for (int y = 0; y < prices.length; y++) {
            if (prices[y] > sum / prices.length) {
                System.out.println("Price more Than Average : " + prices[y]);
            }
        }
// 2.5 print the sum of the middle two prices

// 2.6 print only prices more than average price

// 2.7 find out max price and print out max price and  index of max price
        float max = prices[0];
        for (int x = 0; x < prices.length; x++) {
            if (prices[x] > max ) {
                max = prices[x];
                System.out.println("Max price : " + max + " at Index : " + x);
            }
        }

// 2.8 find out the minimum price and index of minimum price
        float min = prices[0];
        for (int x = 0; x < prices.length; x++) {
            if (prices[x]<min){
                min=prices[x];
                System.out.println("Min price : " + min + " at Index : " + x);
            }
        }
// 2.9 find out second max price and index
//        Arrays.sort(prices);
//        float secondMax = prices.length-1;
//        System.out.println(secondMax);
        float secondMax=prices[0];
        int secondIndex=0;
        for (int  x = 0; x <prices.length ; x++) {
            if(prices[x]> secondMax && prices[x]!=max ){
                secondMax=prices[x];
                secondIndex=x;
            }
        }
        System.out.println("The second index of  max is: " + secondIndex+" the second max is : "+secondMax);
    }
}
