package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        //how to swap two numbers with using temp variable
        int a = 20;
        int b = 45;
        System.out.println("before swaping the number a=" + a + " b= " + b);
        int temp = 0;
        temp = a;//20
        a = b;//45
        b = temp; //20
        System.out.println("After swaping the number a=" + a + " b= " + b);

        //how to swap two numbers without using temp variable
        int x = 78;
        int y = 100;
        System.out.println("before swaping the number x=" + x + " y= " + y);
        x = x + y;//78+100;
        //y=(x+y)-y;  y=x
        y = x - y;//    y=(78+100)-100===>y=78
        // x=(x+y )-y
        x = x - y;//100////x=78+100-78===>x=100
        System.out.println("after swaping the number x=" + x + " y= " + y);

        //how to sort Array swaping the numbers  ***   Arrays.toString(nums);
        int[] num = new int[]{45, 2, 3, 7, 8, 90, 2};
        System.out.println("Before sorting the Array " + Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            for (int j =0; j < num.length-1-i; j++) {
                if (num[j] > num[j+1]) {
                    int temp1 = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp1;
                }
            }
        }
        System.out.println("After sorting the Array " + Arrays.toString(num));

        //reverse the Array
        //                   0 1 2 3 4  5  6
        int arr[] = new int[]{3, 5, 7, 8, 15, 25, 35};
        System.out.println("Before reverse the array " + Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp2 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp2;
        }
        System.out.println("After reverse the array " + Arrays.toString(arr));
        int arr1[] = new int[]{13, 5, 7, 18, 15, 25, 35};
        System.out.println("Before reverse the array " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp3 = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp3;
        }
        System.out.println("After reverse the array " + Arrays.toString(arr1));

        //how to reverse the array using swaping number with temp variable
        //how to sort ArrayList swaping the numbers  ***  Collections.sort(lst);
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(34, 2, 5, 6, 78, 98, 21, 100, 5, 4, 1));
        System.out.println("Before sorting the ArrayList" + lst);
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int temp8 = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, temp8);
                }
            }
        }
        System.out.println("After sorting the ArrayList" + lst);

        //reverse the arraylist using swap method
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34, 2, 5, 6, 78, 98, 21, 100, 5, 4, 1));
        System.out.println("Before reverse the ArrayList " + list);
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {//      int j=list.size()-1-i
            int templist = list.get(i);
            list.set(i, list.get(j));
            list.set(j, templist);
        }
        System.out.println("After reverse the ArrayList " + list);
    }

}

