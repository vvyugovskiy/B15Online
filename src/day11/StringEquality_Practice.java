package day11;

public class StringEquality_Practice {
    public static void main(String[] args) {


        /*
        Checking for String equality should always be done with
        .equals method!

         */



        System.out.println("Java".equals(("java")));
        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println("is my string same as your string ? ");
        // how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr ));


        /*
         create a program to check whether mySrt value is Java
         if true --> CORRECT WORD!!!
         if false --> SAY JAVA!!!
         */
        if (myStr.equals("Java")){
            System.out.println("CORRECT WORD!!!");
        }else {
            System.out.println("SAY JAVA!!!");
        }

    }
}
