package Cybertek.day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // Arrays class comes from a java.util package
        // has a lot of pre-build method to work with array object

        // for printing a content an array
        // toString -->> Arrays.toString(yourArrayHere)
        // the result eold look as a string -->> [.......]

        // for Sorting an Aray in ascending order
        // sort -->> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals --->> Arrays.equals(firstArray, secondArray)

        String[] supers = {"Superman", "Batman", "Wonder Woman", "Aquamen", "Cyborg", "Flash"};
        System.out.println(Arrays.toString(supers));

        String savedSupers = Arrays.toString(supers);
        System.out.println("Saved Supers = " + savedSupers);
        System.out.println(savedSupers.substring(0, savedSupers.length()));

        int[] numbers = {10, 44, 55, 3, 78};
        System.out.println(Arrays.toString(numbers));

        String savedNumbers = Arrays.toString(numbers);
        System.out.println(savedNumbers.length());


    }
}
