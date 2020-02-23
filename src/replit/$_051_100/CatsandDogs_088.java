package replit.$_051_100;

import java.util.Scanner;

public class CatsandDogs_088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for (int i = 0; i <= word.length() - 3; i++) {
            if (word.substring(i, i + 3).equalsIgnoreCase("dog")) {
                countOfDogs++;
            }
            if (word.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countOfCats++;
            }
        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
