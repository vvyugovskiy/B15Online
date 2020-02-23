package day11;
//import java.util.Scanner;

public class WarmUp1_LightOnOff_Char {
    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
        System.out.println("Witch room light is turned on ? ");
        char targetOption='H';


         switch (targetOption) {
            case 'B':
                System.out.println("You have turned on bedroom light");
                break;
             case 'L':
                 System.out.println("You have turned on Living room light");
                 break;
             case 'K':
                 System.out.println("You have turned on Kitchen light");
                 break;
             case 'H':
                 System.out.println("You have turned on Hallway light");
                 break;
             default:
                 System.out.println("No such room");
                 break;
        }




    }
}
