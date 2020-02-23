package office_hours;

import java.util.Scanner;

public class Practice_11_26 {
    public static void main(String[] args) {

        /*

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("You want food or not");
        String mainOption = scan.next();



        if (mainOption.equalsIgnoreCase("food")) {
            System.out.println("You selected the food");
            System.out.println("snack or meal?");
            String secondaryOption = scan.next();
            if (secondaryOption.equalsIgnoreCase("snack")) {
                System.out.println("You've selected the Snack");
            } else if (secondaryOption.equalsIgnoreCase("meal")) {
                System.out.println("You got the meal");
            } else {
                System.out.println("No such food");
            }
        } else {
            System.out.println("Try again");
        }
    }

}
