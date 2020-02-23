package replit.$_101_150;

import java.util.Arrays;

public class ArraysCopyCertainValues_129 {
    public static void main(String[] args) {

//        Given a String array arr with the following elements
//                ["zero", "one", "two","three","four"]
//        Create another array fewValues and copy words that have letter "e" in them
//        You need to know how many element contain "e" and create array accordingly
//        Values in fewValues array need to be["zero", "one","three"]

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
    String containsE = "";
        for (String eachE :arr) {
            if (eachE.contains("e")){
                containsE+=eachE+" ";
            }
        }
        //System.out.println(containsE);
String [] fewValues = containsE.split(" ");


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
