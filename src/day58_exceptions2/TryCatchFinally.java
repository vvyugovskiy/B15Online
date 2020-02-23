package day58_exceptions2;

import java.util.Properties;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try {
            System.out.println("Hello From Try Block");
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception happened and caught");
        } finally {
            System.out.println("Finally block. Runs if there is exception or no exception");
        }
        System.out.println("After try catch");
    }

}
