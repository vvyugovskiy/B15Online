package day27;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    /* Array: a variable that allows us to store mutiple values
           Array's size is fixed and must be initialised before using it
                declaration:
                    Data-Type [] variableName = {data1,data3...... }
                reqular variables:
                    we can only store one single value
                        int a= 10;
                array variables:
                        int [] arr ={1,2,3};
                        index: 0   1   2

                retrieve data:
                        arrayName[indexNumber]==>>element of that index number
                        EX:
                            arr[2]==>>3

     */
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10, 20, 30, 40, 50, 60};
        // lenght: returns the total number of elements from the array
        // last index num: arr.length-1
        int num1 = arr[arr.length - 1];
        //                   6-1    =5
        System.out.println(num1);
        System.out.println("+++++++++++++++++++++++++++++");
        // expected result: 10 20 30 40 50 60
        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.println(arr[x] + " ");
        }
        System.out.println("\n+++++++++++++++++++++++++++");
// Arrays.toString(VariableName):
        String str = Arrays.toString(arr);
        System.out.println(str);

        // TAsk01: write a program that asks user to enter a number 5 times. and store numbers into array
        int [] numbers = new int [5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter int number");
            int input = scan.nextInt();
            numbers[i]=input;
        }
        System.out.println(Arrays.toString(numbers));

        // Array.sort(variableName): sorts an array in ascending order
        Arrays.sort(numbers);
        int largestNumber=numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println(largestNumber);
        System.out.println("minNumber = " + minNumber);



    }
}
