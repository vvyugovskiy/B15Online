package office_hours;

import java.util.Scanner;

public class Practice_12_04 {
    public static void main(String[] args) {

        // Create a program
        // start and end point
        // then print all in between
        // it could be starting character is after ending character
        // for ex. user can enter z a or ak
        // Can we ask user Character ? NO
        // Ask user for String and pick first character by charAt(0)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st word with single character to start with");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);
        System.out.println("Enter 2nd word with single character to end with");
        String second = scanner.next();
        char secondAsChar = second.charAt(0);

        //   user enter  A for first part
        //   user enter C for second part
        // expected result should be A B C

        for (char iChar = firstAsChar; iChar <= secondAsChar; iChar++) {
            System.out.print(iChar + " ");
        }

        // OPTIONAL!!!!!

//      WHAT IF WE DON'T WANT TO INCLUDE USERS STARTING AND ENDING POINT// ?
//        for(char iChar = (char)(firstAsChar+1) ; iChar < secondAsChar ; iChar++){
//
//            System.out.print( iChar + " ");
//        }

        //   user enter  D for first part
        //   user enter  A  for second part
        // expected result should be D C B
    }
}
