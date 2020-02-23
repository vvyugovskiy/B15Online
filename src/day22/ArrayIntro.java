package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        // syntax for creating variable to store single item
        // and assigning value
        // dataType variableName = value here
        int num1 =10;
        // syntax for creating variable to store single item
        // and assigning value
        // dataType [] variableName = new dataType [count of item];
        // this Array can hold 4 items, it's also known as array size
        int [] scores = new int[4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        // updating the value at certain index
        scores[1]=99;
        System.out.println(scores[1]);
        // ones array is created with certain size, WE CAN NOT change the size!!!
        // When you create new Array Object
        // it will get defaults value in each element
        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // create an byte aray with size 4
        // and store it into a variable called date

        // assign value for each index location
        // print out the values at each index

        // update last index value
        // then print it out
        System.out.println("_______________________________");
        byte [] data = new byte [4];
        data [0]=2;
        data [1]=13;
        data [2]=9;
        data [3]=5;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        data [2]=69;
        System.out.println(data[2]);

    }
}
