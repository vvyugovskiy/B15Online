package Cybertek.day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        String  message = "I love Pumpkin, Pumpkin Is FUN!!!";
        String J = message.replace("Pumpkin", "Cybertek");
        System.out.println(J);

        String message2 = "Happy Thanks Giving to All";
        System.out.println(message2);

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        //remove all spaces
        System.out.println(message2);
        message2=message2.replace(" ","");
        System.out.println(message2);

        String message3 = "Tomorrow is Off No";
        // How to remove No?
        System.out.println(message3.replace("No",""));



    }
}
