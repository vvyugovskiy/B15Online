package practice.OCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam_Part2 {

    public static void main(String[] args) {

        //1.
//        String[] planets = {"Mercury", "Venus", "Earth", "Mars"};
//        int x = planets.length; // 4
//        int y = planets[1].length(); // 5
//        System.out.println(x + " " + y);  ===>>> 4 5

        //2.
//        String[] arr = {"A", "B", "C", "D"};
//        for (int i = 0; i < arr.length; i++) { // 4
//            System.out.print(arr[i] + " ");   // A
//            if (arr[i].equals("C")){
//                continue;
//            }
//            System.out.println("Work done");
//            break;
//        }                                    ===>>> A Work done

        //3.

//        int i = 10;
//        int j = 20;
//        int k = j += i / 5;
//        // 22   20  +  2
//        System.out.println(i + " : " + j + " : " + k); // ==>>> 10 : 22 : 22

        //4.

//        int num = 5;
//        do{
//            System.out.println(--num + " ");
//        }while (num==0);  //                 ===>>> 4

        // 5.
//
//        float f1 = (1_560.00 > 12_60.00) ? 10 : 20;
//        System.out.println(f1);                      ===>>> 10.0

        // 6.

//        float f1 = (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f;
//        float f2 = f1 + 1024;
//        System.out.println(f2); // ===>>> 13480.00

        //7.

//        int arr[] = {1, 2, 3, 4};
//        int i = 0;
//        do {
//            System.out.print(arr[i] + " "); // ===>>>  1 2 3
//            i++;
//        } while (i < arr.length - 1);

        //8.

//        int num = 5; // line 2
//        while (isAvailable(num)) {    // line 3
//            System.out.print(num); // line 4
//            num--; // line 5      <<<==== INSERT THIS LINE
//        }
//    }
//
//    public static boolean isAvailable(int num) {  // line 6
//        return num-- > 0 ? true : false; // line 7

        //9.

//        int x = 1;
//        int y = 0;
//        if (x++ > ++y) {
//            System.out.print("Hello ");
//        } else {
//            System.out.print("Welcome ");
//        }
//        System.out.println("Log " + x + " : " + y);  // Welcome Log 2 : 1

        //10.

//        int array[] = {10, 20, 30, 40, 50};
//        int x = array.length;  // 5
//    -----------------------------------------------------------------
//        while (x > 0) {
//            System.out.print(array[--x] + " ");
//        }
//     ------------------------------------------------------------------
//        while (x > 0) { /*  Line n1  */
//            x--;
//            System.out.print(array[x]+ " ");
//        }

        //11.

//    public static void main(int[] args) {
//        System.out.println("int main");
//    }
//    public static void main(String[] args) {
//        System.out.println("String main");
//    }
//    public static void main(double[] args) {
//        System.out.println("double main");
//    }
//    public static void main(char[] args) {
//        System.out.println("char main");
//    }
//                                           ===>>>  String main

        //12.

//    /*A.*/ float flt = 100f;
//    /*B.*/ float flt1 = 100;
//    /*C.*/ double y1 = 200; // <<<=== ERROR
//           float flt2 = y1;
//    /*D.*/ int y2 = 100;
//           float flt3 = y2;

        //13.

//        /*A.*/ ArrayList<String> lst = new ArrayList<String>();
//        /*B.*/ ArrayList<String> lst1 = new ArrayList<>();
//        /*C.*/ ArrayList<> lst2 = new ArrayList<String>();  // <<<=== COMPILE ERROR
//        /*D.*/ List <String> lst3 = new ArrayList<>();

        //14.

//        ArrayList<int> lst = new ArrayList<>();  <<<=== COMPILE ERROR/ int type
//        lst.add(10);
//        System.out.println(lst);

        //15.

//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        int a = 1;
//        list1.remove(a);  <<<=== REMOVES INDEX
//        System.out.println(list1); //  ===>>> [1, 3]

        //16.

//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        Integer a = 1;
//        list1.remove(a);   <<<=== REMOVES OBJECT
//        System.out.println(list1); //  ===>>> [2, 3]

        //17.

//        int x = 7;
//        if (available(x)) {
//            System.out.println("Java SE");
//        } else {
//            System.out.println("Java EE");
//        }
//    }
//    public static boolean available(int x) {
//        return x > 1 ? true : false;           ===>>> Java SE

        //18.

//        int var1 = 200;  // ALWAYS 200
//        System.out.print(doCalc(var1));  // ==>> 400
//        System.out.print(" " + var1);    // ==>> 200
//    }
//    static int doCalc(int var1) {
//        var1 = var1 * 2;
//        return var1;

        //19.

//        String[][] chs = new String[2][];
//        chs[0] = new String[2];
//        chs[1] = new String[5];
//        int i = 97;
//        for (int a = 0; a < chs.length; a++) {
//            for (int b = 0; b < chs.length; b++) {
//                chs[a][b] = "" + i;
//                i++;
//            }
//        }
//        for (int a = 0; a < chs.length; a++) {
//            for (int b = 0; b < chs[a].length; b++) {
//                System.out.print(chs[a][b] + " ");
//            }
//        }                                    ===>>>   97, 98, 99, 100, null, null, null

        //20.

//        int ii = 0;
//        int jj = 7;
//        for (ii = 0; ii < jj - 1; ii = ii + 2) {
//            System.out.print(ii + " ");             //    ===>>> 0 2 4
//        }

        //21.

//        if (args[0].equals("Hello") ? false : true ){
//            System.out.println("Success");
//        }else{
//            System.out.println("Failure");
//        }                                        !!! ===>>> Failure  !!!

        //22.

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Robb");
//        names.add("Bran");
//        names.add("Rick");
//        names.add("Bran");
//        if (names.remove("Bran")) {
//            names.remove("John");
//        }
//        System.out.println(names);  // ==>> [Robb, Rick, Bran]

        //23.

//        doSum(10, 20);  // ==>> int First
//        doSum(10.0, 20.0); //  ==>> double First
//    }
//    public static void doSum(Integer x, Integer y) {
//        System.out.println("Integer sum is " + (x + y));
//    }
//    public static void doSum(double x, double y) {
//        System.out.println("double sum is " + (x + y));
//    }
//    public static void doSum(float x, float y) {
//        System.out.println("float sum is " + (x + y));
//    }
//    public static void doSum(int x, int y) {
//        System.out.println("int sum is " + (x + y));
        //    int sum is 30
        //    double sum is 30.0

        //24.

//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("green");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("yellow");
//        colors.add(3,"cyan");
//        System.out.println(colors);  // ==>> [green, red, blue, cyan, yellow]

        //25.


//        Which statement best describes encapsulation?

//       /*A.*/  Encapsulation ensures that classes can be designed so that only certain fields and methods of an object are accessible from other objects.  <<<===
//
//       /*B.*/ Encapsulation ensures that classes can be designed so that their methods are inheritable.
//
//       /*C.*/ Encapsulation ensures that classes can be designed with some fields and methods declared as abstract.
//
//       /*D.*/ None of the above

        //26.

//      What is the name of the Java concept that uses access modifiers to protect variables and hide them with in a class?

//        Encapsulation  <<<===
//        Inheritance
//        Instantiation
//        Polymorphism
//        Abstraction

        //27.

//        Boolean[] bool = new Boolean[2];
//        bool[0] = Boolean.valueOf(Boolean.parseBoolean("true"));
//        bool[1] = Boolean.valueOf(null);  // ALL THAT DOES NOT RETURN TRUE IS FALSE
//        System.out.println(bool[0] + " " + bool[1]); // ==>> true : false

        //28.

//       Exam_Part2 f = new Exam_Part2();
//       f.printAll();
//    }
//    char c;    // nothing
//    boolean b; // false
//    float f;   //  0.0
//    void printAll (){
//        System.out.println("c = " + c);
//        System.out.println("b = " + b);
//        System.out.println("f = " + f);

        //29.

//        Which three statements are true about the structure of a Java class?
//        The methods are mandatory components of a class
//        A class can have only one private constructor
//        A class can have overloaded static methods           <<<===
//        A public class must have a main method
//        The fields don't need to be initialized before use   <<<===
//        A method can have the same name as a field           <<<===

        //30.

//        int data[] = {2010, 2013, 2014, 2015, 2014};
//        int key = 2014;
//        int count = 0;
//        for (int each : data) {
//            if (int each != key) { <<<=== each already initialized
//                continue;
//                count++; //        <<<=== Unreachable statement
//            }
//        }
//        System.out.println(count + " Found ");   ===>>> COMPILATION ERROR

        //31.

//package p1;
//        public  class  A {            }
//package p1.p2;
//// line  n1
//        public  class  B  {
//            public void  doStuff (  ) {
//                A   b   =  new   A(  );
//            }
//        }
//package p3;
//// line  n2
//        public  class  C  {
//            public static  void   main ( String...  args )  {
//                A   obj1 =  new  A (  );
//                B   obj2 = new   B (  );
//            }
//        }

//        Which modification enables the code to compile?


//        Replace line n1 with:  import p1;
//        Replace line n2 with:  import p1;
//                               import p1. p2;
//-------------------------------------------------
//        Replace line n1 with:  import p1. A;
//        Replace line n2 with:  import p1.*;
//-------------------------------------------------
//        Replace line n1 with:  import p1.*;
//        Replace line n2 with:  import p1. p2.*;
//-------------------------------------------------
//        Replace line n1 with:  import p1. A;         <<<====
//        Replace line n2 with:  import p1. A;
//                               import p1. p2.B ;

        //32.

//        System.out.print(isAvailable + " ");     // ===>>> false
//        isAvailable = doStuff();
//        System.out.println(isAvailable);         // ===>>>  true
//    }
//    public static boolean doStuff() {
//        return !isAvailable;
//    }
//    static boolean isAvailable = false;

        //33.

//        package sales;
//        public class SalesMan {
//        }
//
//        package sales.products;
//        public class Product {
//        }
//
//        package market;
//        ******// line 2 *******
//        public class USMarket {
//            SalesMan sm;
//            Product p;
//    ------------------------------------
        // import sales.*;                  !!!   <<<<====   !!!
        // import sales.products.*;

        //34.

//        displayMSG(); // line n3
//        displayMSG();  //line n4
//
//    }
//
//    int count;
//    public static void displayMSG() {
//        count++;                                                   //line n1    <<<=== ERROR
//        System.out.println("Welcome " + "Visit Count: " + count); // line n2    <<<=== ERROR

        //35.

//        Given the code fragment:
//
//        int[] array = {1, 2, 3, 4, 5};
//
//        And given the requirements:
//
//        1. Process all the elements of the array in the order of entry.
//        2. Process all the elements of the array in the reverse order of entry.
//        3. Process alternating elements of the array in the order of entry.
//
//                Which two statements are true?
//
//        Requirement 1 can be implemented by using the enhanced for loop (For each loop ).             <<<===
//        Requirements 1, 2, and 3 can be implemented by using the enhanced for loop (For each loop ).
//        Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
//        Requirements 1, 2, and 3 can be implemented by using the standard for loop.                   <<<===

        //36.

//        Short s1 = 200;
//        Integer s2 = 400;
//        Long s3 = (long)s1+s2;    // line n1
//        String s4 = (String) (s3*s2); // line n2  // ===>>> String CASTING??? REALLY!!!
//        System.out.println("Sum is " + s4);

        //37.

//        String [] strs = new String[3];
//        int idx = 0;
//        for (String s : strs){
//            strs[idx].concat(" element " + idx);
//            idx++;
//        }
//        System.out.println(Arrays.toString(strs));  ===>>> Exception is thrown at Run time

        //38.

//        System.out.println("Hello " + args[0]);

        //                                      ===>>>    javac Greeting.java
        //                                                java Greeting Duke

        //39.
//        System.out.println(new String ("Java SE 8"));
//        System.out.println(new MyString("Java SE 8"));
//
//    }
//    class MyString {
//        String msg;
//        public MyString (String str){
//            msg = str;
//        }                                         !!!  ===>>>   Java SE 8 !!!
        //                                               ===>>>   @ HashCodes
    }
}
