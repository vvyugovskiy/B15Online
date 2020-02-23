package replit.$_051_100;

import java.util.Scanner;

public class SMSMessage_078 {
    public static void main(String[] args) {

//        We have a message variable already declared and assigned value in this format
//        Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
//        Variables are already declared:
//        sender, phoneNumber, messageBody
//                - by using String methods:
//        retrieve related information from SMSmessage string and assign to those 3 variables.
//                -print each variable in separate line

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        int indexOf1 = message.indexOf("<");
        int indexOf2 = message.indexOf(">");
        int indexOf3 = message.indexOf("[");
        int indexOf4 = message.indexOf("]");
        int indexOf5 = message.indexOf("{");
        int indexOf6 = message.indexOf("}");
        sender = message.substring(indexOf1+1,indexOf2);
        phoneNumber = message.substring(indexOf3+1,indexOf4);
        messageBody = message.substring(indexOf5+1,indexOf6);
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);

    }
}
