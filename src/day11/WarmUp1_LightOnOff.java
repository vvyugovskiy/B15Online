package day11;
import java.util.Scanner;
public class WarmUp1_LightOnOff {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Witch room light is turned on ? ");
        String targetOption=scan.next();


        switch (targetOption) {
            case "Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on Living room light");
                break;
            case "Ki":
                System.out.println("You have turned on Kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on Hallway light");
                break;
            default:
                System.out.println("No such room");
                break;
        }




    }
}
