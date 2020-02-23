package practice.OCA;

import java.util.Arrays;

public class Exam_Part1 {
    public static void main(String[] args) {
//OSA Test 1:
        //1
//        int[][] arr = new int[][]{{1, 2}, {3, 4}};
//        arr[1]=arr[0];
//        System.out.println(arr[1]);
// ====>>> Hashcode

        //2.
//        int [][] arr = new int [2][];
//        double [][] arr1 = new double[][]{{1,2},{3,4}};
//        long [][] arr2 = new long[2][] {{1,2},{3,4}}; //  <<== compile error
//        int [][] arr3 =  {{'A','B'},{'C','D'}};

        //3.
//        int[][] arr = {{1, 2, 3}, {3, 4}};
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//        } ==>>> 1 2 3 4

        //4.
//        int ivar = 100;
//        double dvar = 123;
//        float fvar = 200;
//        ivar = fvar;
//        fvar = ivar;
//        dvar=fvar;
//        fvar = dvar;
//        dvar = ivar;
//        ivar = dvar;
        // ==>> line 4, line 7, line 9

        //5.
        //int arr[] = new int[2];  <<<====
        //int[] arr n = new int[2];
        //int[] arr; arr = int[2];
        //int arr[2] ;

        //6.
//        System.out.println("Result A"+0+1);
//        System.out.println("Result B"+(1)+(2));
        // ==>>> ResultA01 ResultB12

        //7.
//        System.out.println("5 + 2 = " + 3 + 4);
//        System.out.println("5 + 2 = " + (3 + 4));
        // ==>>> 5+2 = 34 : 5+2 = 7

        //8.
//        String str = " ";
//        str.trim(); // DOES NOT CHANGE ORIGINAL str!
//        System.out.println(str.equals("") + " " + str.isEmpty());
//        System.out.println(">"+str+"<");
        //  false false

        //9.
//        int[][] arr = {{1, 2}, {3, 4}};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }  ===>>> 3 4 1 2

        //10.
        /*
         Which statement is true about Java byte code?
           * It can run on any platform that has a Java compiler
            It can run on any platform only if it was compiled for that platform
            It can run on any platform that has the Java Runtime Environment     <<====
            It can run on any platform.

         */

        //11.
//        String [][] arr = {{"A","B","C"},{"D","E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//                if (arr[i][j].equals("B")){
//                    break;
//                }
//            }
//        }  ===>>> A B D E

        //12.
//        int wd = 0;
//        String[] days = {"sun", "mon", "wed", "sat"};
//        for (int i = 0; i < days.length; i++) {
//            switch (days[i]) {
//                case "sat":
//                case "sun":
//                    wd -= 1;
//                    break;
//                case "mon":
//                    wd++;
//                case  "wed":
//                    wd+=2;
//            }
//        }
//        System.out.println(wd);
        // ===>>> 3

        //13.
//        String [][] arr = {{"A","B","C"},{"D","E"}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j].equals("B")){
//                    break;
//                }
//                System.out.print(arr[i][j]);
//            }
//        }  ===>>> A D E

        //14.
//        int [] num1 = new int [3];
//        int [] num2 = {1,2,3,4,5};
//        num1 = num2;  // here num2 changes num1 size to 5 and copies all numbers in it
//        for (int i = 0; i < num1.length; i++) {
//            System.out.print(num1[i]);
//        } === >>> 12345

        //15.
//        int[] arr1 = {1, 2, 3, 4, 5};
//        for (int e = 0; e < 5; e += 2) {  <<<=== int e = 0; e < 5; e += 2
//            System.out.print(arr1[e]);
//
//        }

        //16.
        /*

         Which statement is true about the switch statement?
            The break statement, at the end of each case block, is mandatory
          * Its expression must evaluate to a single value  <<<====
            It must contain the default section
            Its case label literals can be changed at run time

         */

        //17.
//        int x = 100;
//        int a = x++;
//        int b = ++x;
//        int c = x++;
//
//        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;   <<<=== Compilation fail
//        System.out.println(d);

        //18.

//        int[] numbers = {1, 2, 3, 4, 5};
//        int max = findMax(numbers);
//    }
//
//    static int findMax(int[] numbers) { <<<=== static int findMax(int [] numbers)
//        int max = 0;
//        return max;

        //19.

//        int num = 10;
//        add10(num);
//        System.out.println(num); ==>> 10
//    }
//
//    static void add10(int num) { ==>> 20
//       num = num + 10;   ==>> 20
// ===>>> 10

        //20.

//        String ta = "A";
//        ta = ta.concat("B ");
//        String tb = "C ";
//        ta = ta + tb;
//        ta.replace('C', 'D'); // does not change String
//        ta = ta + tb;
//        System.out.println(ta); ===>>> ABCC

        //21.

//        String str1 = "Java";
//        String[] str2 = {"J", "a", "v", "a"};
//        String str3 = "";
//
//        for (int i = 0; i < str2.length; i++) {
//            str3 += str2[i];
//        }
//        boolean b1 = str1 == str3;        // false
//        boolean b2 = str1.equals(str3);   // true
//        System.out.println(b1 + " " + b2);   ===>>> false true

        //22.

//        int numbers [];
//        numbers[0] = 10; // <<<=== compilation fails, Array size must be declared
//        numbers[1] = 20;
//
//        numbers = new int[4];
//        numbers[2] = 30;
//        numbers[3] = 40;
//        System.out.println(Arrays.toString(numbers));

        //23.

//        int numbers[];
//        numbers = new int[2];
//        numbers[0] = 10; // [10,0]
//        numbers[1] = 20; // [10,20]
//
//        numbers = new int [4]; // create a new numbers array size [4] {0,0,0,0}
//        numbers[2] = 30; // [0,0,30,0]
//        numbers[3] = 40; // [0,0,30,40]
//        System.out.println(Arrays.toString(numbers)); // <<<=== [0,0,30,40]

        //24.

//        String str = "Hello World";
//        str.trim();
//        int z = str.indexOf(" ");
//        System.out.println(z); // ==>> 5

        //25.

//        String str1 = "Java";
//        String str2 = new String ("java");
//        if (str1.equalsIgnoreCase(str2)){  /* Line1 */ <<<===
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not equal");
//        }

        //26.

//        String stuff = "TV";
//        String res = "";

//         stuff.equals("TV") ? res = "Walter" : stuff.equals("Movie") ? res = "White" : res = "No Result";
//         res = stuff.equals("TV") ? "Walter" : else stuff.equals("Movie") ? "White" : "No Result";
//         res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" : "No Result";         <<<===

//        if (stuff.equals("TV")) {
//            res = "Walter";
//        } else if (stuff.equals("Movie")) {
//            res = "White";
//        } else {
//            res = "No result";
//        }
//        System.out.println(res);

        //27.

//        String num1 = args[1];
//        String num2 = args[2];
//        String num3 = args[3];
//
//        System.out.println("number is " + num3);
//        // java Spartans 0 1 2 3
//        // java Spartans 1 3 2 2    <<<===
//        // java Spartans 1 2 2 3
//        // java Spartans 1 2 2 3 4

        //28.

//        String shirts [][] = new String[2][2];
//        shirts[0][0] = "red";
//        shirts[0][1] = "blue";
//        shirts[1][0] = "small";
//        shirts[1][1] = "medium";
//
//        for(int i=0; i<2; ) {
//            for(int j=0; j<2; ) {
//                System.out.print(shirts[i][j]+":"); <<<===
//                j++;
//            }
//            i++;
//        }
//        /* Line1  */

        //29.

//        String str = "Batch 11";
//        int z = str.trim().length();
//        System.out.println(z); ==>>  8

        //30.

//        int[] intArr = {15, 30, 45, 60, 75};
//        intArr[2] = intArr[4];
//        intArr[4] = 90;
//        System.out.println(Arrays.toString(intArr)); // ===>>> [15,30,75,60,75]

        //31.

//        double z = 10;
//        switch (z) {  // ==>>> incompatible type. Switch DOES not Accept double, float, long, boolean
//            case 10:
//                System.out.println("Monday");
//            case 11:
//                System.out.println("Tuesday");
//            case 12:
//                System.out.println("Wednesday");
//            default:
//                System.out.println("Friday");
//        }

        // 32.

//        boolean B = true;
//        switch (B){   // ==>>> incompatible type, DOES not accept boolean
//            case  true:
//                ....
//        }

        // 33.

//        String str1 = "Java";
//        String str2[] = {"J", "a", "v", "a"};
//        String str3 = "";
//        for (int i = 0; i < str1.length(); i++) {
//            str3 = str3 + str2[i];
//        }
//        System.out.println(str1 == str3);  // equality check (if object is the same)
//        System.out.println(str1.equals(str3));
//        // false : true

        //34.

//        int [] arr = {10,20,30};
//        int size = arr.length;
//        int idx = 0;
//        /* Line n1  */
//        ---------------------------
////        do{
////            idx++;               <<<===
////        }while (idx<size-1);
//       ----------------------------
//        System.out.println(arr[idx]);

        //35.

//        int num1 = 9;
//        if (++num1 < 10) {
//            System.out.println(num1 + " Hello World!");
//        } else {
//            System.out.println(num1 + " Hello Universe!");
//        }  ===>>> 10 Hello Universe!

        //36.
//        int /* short, byte */ x = 1;  <<<===
//        switch (x) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//        }
    }

}
