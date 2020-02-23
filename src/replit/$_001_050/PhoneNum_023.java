package replit.$_001_050;

import java.util.Scanner;

public class PhoneNum_023 {
        //YOUR CODE HERE
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // System.out.println("areaCode");
            int areaCode = scan.nextInt();

            // System.out.println("localNumber");
            int localNumber = scan.nextInt();


            String phoneNumber ="("+areaCode+")-"+localNumber;
            System.out.println("Calling number "+phoneNumber);
    }
}
