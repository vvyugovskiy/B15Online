package Cybertek.day26;

public class ArrayReview {
    public static void main(String[] args) {
        int [] myNumbers = new int [4]; // 4 is item count

        myNumbers [0] = 10;
        myNumbers [1] = 40;
        myNumbers [2] = 30;
        myNumbers [3] = 7;

// 1.1 I want to add 1 to the second item value
        myNumbers[1]=myNumbers[1]+1;

// 1.2 I want to double the secont item value
        myNumbers [1]=myNumbers [1]*2;

// 1.3 I want to assign 3rd item value to sum of first and second item
// Just chanje my int  array data type to int to avoid issues
        myNumbers[2]= myNumbers[0]+myNumbers[1];

// 1.4 Swap the first item value with last item value

        int temp = myNumbers [0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;

        System.out.println(myNumbers[0]+" "+myNumbers[1]+" "+myNumbers[2]+" "+myNumbers[3]);

    }
}
