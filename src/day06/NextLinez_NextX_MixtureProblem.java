package day06;

import java.util.Scanner;

public class NextLinez_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = blabla.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your age ?");
        int age = blabla.nextInt();
        //String age = blabla.nextLine();
        // notice we are not storing this info variable
        // we just want below kine to capture ENTER keyboard input
        // so it does not get captured by the nextLine
        // we use to capture the address
        blabla.nextLine();
        System.out.println("Your name is "+age);

        System.out.println("What is your address ?");
        String address = blabla.nextLine();
        System.out.println("Your name is "+address);


    }
}
