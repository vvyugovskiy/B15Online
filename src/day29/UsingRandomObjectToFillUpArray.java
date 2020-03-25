package day29;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class UsingRandomObjectToFillUpArray {
    public static void main(String[] args) {
//------------------------java.util.Random-------------------------------------------------------------------------
        // There is a class called Random under java.util package
        // and it has methods to easily get random number within the range

        // just like scanner , first we need to import
        // import java.util.Random
        // Then create an Random Object and store assign it to a variable
        Random myRd = new Random();
        // call a method called nextInt(range)
        // this will generate random number from 0-9
        int randomNumber = myRd.nextInt(10);
        System.out.println("nextInt: " + randomNumber);

        boolean b = myRd.nextBoolean();
        System.out.println("nextBoolean: " + b);

        double lala = myRd.nextDouble();
        System.out.println("nextDouble: " + lala);

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            // assigning random number from 0-99 each time
            numbers[i] = myRd.nextInt(100);
        }

        // run couple times and observe the result. you will get different array each time
        System.out.println("Random numbers = " + Arrays.toString(numbers));


//-------------------------------------Math.random()------------------------------------------------------------------

        System.out.println("Math.random(): " + Math.random());
        System.out.println("Math.random(): " + Math.random());
//---------------------------------------- java.util.concurrent.ThreadLocalRandom class------------------------------

        int ThreadLocalRandomInt = ThreadLocalRandom.current().nextInt(18);
        double ThreadLocalRandomDouble = ThreadLocalRandom.current().nextDouble(69, 70);
        boolean ThreadLocalRandomBool = ThreadLocalRandom.current().nextBoolean();

        System.out.println("ThreadLocalRandomInt: " + ThreadLocalRandomInt);
        System.out.println("ThreadLocalRandomDouble: " + ThreadLocalRandomDouble);
        System.out.println("ThreadLocalRandomBool: " + ThreadLocalRandomBool);
    }
}
