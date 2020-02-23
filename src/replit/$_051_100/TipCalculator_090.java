package replit.$_051_100;

import java.util.Scanner;

public class TipCalculator_090 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String answer = scan.next();

        System.out.println("Number of people:");
        int numPeople = scan.nextInt();

        System.out.println("Check amount:");
        double totalToPay = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        String people = "";
        for (int p = 0; p < numPeople; p++) {
            people += "&";
        }
        double totalTip = 0;
        if (serviceQuality.equalsIgnoreCase("Excellent")) {
            totalTip = totalToPay * 0.25;
        } else if (serviceQuality.equalsIgnoreCase("Great")) {
            totalTip = totalToPay * 0.2;
        } else if (serviceQuality.equalsIgnoreCase("Good")) {
            totalTip = totalToPay * 0.15;
        } else if (serviceQuality.equalsIgnoreCase("Fair")) {
            totalTip = totalToPay * 0.1;
        } else if (serviceQuality.equalsIgnoreCase("Poor")) {
            totalTip = totalToPay * 0.05;
        }

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + (totalToPay + totalTip));
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + ((totalToPay+totalTip) / numPeople));
        System.out.println("Tip per person: " + (totalTip / numPeople));


    }
}
