package practice;

import java.util.Scanner;

public class la {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String dogMessage = scan.nextLine();
        System.out.println(dogMessage.indexOf("dog"));
        String newDogMessage = dogMessage.replaceAll("dog"," ");
        System.out.println(newDogMessage);
        System.out.println(dogMessage.substring(dogMessage.indexOf("dog")+3));

    }
}
