package replit.$_001_050;

import java.util.Scanner;

public class Citizens_036 {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE

        int seniorCitizens, nonSeniorCitizens, age;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = object.nextInt();
        nonSeniorCitizens = object.nextInt();
        System.out.println("What is new citizen's age?");
        age = object.nextInt();
        if (age >= 65) {
            System.out.println("Senior Citizen");
            ++seniorCitizens;
        } else {
            System.out.println("Non-Senior Citizen");
            ++nonSeniorCitizens;
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);
        System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);


    }
}
