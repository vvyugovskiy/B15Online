package replit.$_001_050;

import java.util.Scanner;

public class VehicleRecall_045 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = object.nextInt();
        if (vehicleYear>=1995 && vehicleYear <=1998){
            System.out.println("Your vehicle needs to be recalled!");
        }else if (vehicleYear>=2001 && vehicleYear <=2002) {
            System.out.println("Your vehicle needs to be recalled!");
        } else if (vehicleYear>=2004 && vehicleYear <=2006){
            System.out.println("Your vehicle needs to be recalled!");
        } else if (vehicleYear>=2015 && vehicleYear <=2017) {
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }


        }
}
