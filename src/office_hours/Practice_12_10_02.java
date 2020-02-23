package office_hours;


import java.util.Arrays;
import java.util.Scanner;

public class Practice_12_10_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 languages that you know");

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();

        String [] languages = {l1,l2,l3};
        //                     0   1  2
        System.out.println(languages[2]);
        // 1. Print all values as a String
        System.out.println(Arrays.toString(languages));
        // 2. for each loop
        for (String lan : languages) {
            System.out.println(lan);
        }
        // 3. for loop
        for (int languageIndex = 0; languageIndex < languages.length; languageIndex++) {
            System.out.println(languages[languageIndex]);

        }
    }
}