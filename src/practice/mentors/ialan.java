package practice.mentors;

import java.util.Scanner;

public class ialan {
    public static void main(String[] args) {

        /*
        Hello World
        Variables:
        Primitives dat types
        int**
        long
        byte
        double**
        float
        boolean**
        short
        char**
        Conditions (Selection)
        if
        if else
        switch
        String (Object)
        String methods
                substring
                indexOf
                length
                lastIndexOf
                toUpperCase
                toLoverCaase
                CharAt
                ....
        Loops
               while loop
               do while loop
               for loop

         */

        int counter = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int eCounter = 0;
        int fCounter = 0;
        int grade;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter Grade (-1 to exit)");
            grade = input.nextInt();
            if (grade != -1 && grade >= 0 && grade <= 100) {

                if (grade >= 90)
                    aCounter++;
                else if (grade >= 80)
                    bCounter++;
                else if (grade >= 70)
                    cCounter++;
                else if (grade >= 60)
                    dCounter++;
                else
                    fCounter++;

            } else {
                System.out.println("Enter a valid grade : ");
            }
        } while (grade != -1);
        System.out.println("Total Number Of Grades = " + (aCounter + bCounter + cCounter + dCounter + eCounter + fCounter));
        System.out.println("Number of A's = " + aCounter);
        System.out.println("Number of B's = " + bCounter);
        System.out.println("Number of C's = " + cCounter);
        System.out.println("Number of D's = " + dCounter);
        System.out.println("Number of E's = " + eCounter);
        System.out.println("Number of F's = " + fCounter);

    }
}

