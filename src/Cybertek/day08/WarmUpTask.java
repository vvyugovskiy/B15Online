package Cybertek.day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        /*
        1. Voting Eligibility Program
        Create a var. called age as int
        check whether the age is more than 18
        if Yes: ready to vote!
        if not Print Wait till you are 18

        2. Create a var. to guess your favorite number
        var. = myFavoriteNumber as int
        As user to guess your favorite number
        If guest right print BINGO
        it not print Try Again Later
         */
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("What is your age ? ");
        age = scan.nextInt();

        System.out.println(age>=18);
         if(age>=18)  {
            System.out.println("You are ready to Vote");

        } else {
            System.out.println("Wait until you turn 18");
        }



    }

}
