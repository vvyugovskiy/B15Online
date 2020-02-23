package day11;
import java.util.Scanner;

public class WarmUp1_LightOnOff_IFELSE {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Witch room light is turned on ? ");
        String targetOption = scan.next();


        if (targetOption.equals("Bd")) {
            System.out.println("You have turned on bedroom light");
        } else if (targetOption.equals("Lr")) {
            System.out.println("You have turned on Living Room light");
        } else if (targetOption.equals("Ki")) {
            System.out.println("You have turned on Kitchen light");
        } else if (targetOption.equals("Ha")) {
            System.out.println("You have turned on Hallway light");
        } else {
            System.out.println("There is no such room");
        }




    }
}
