package Cybertek.day13;

public class StringMethod {
    public static void main(String[] args) {

        // String action that we already know so far

        // equals

        String s1 = "HellO";
        System.out.println(s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));
        // toUpperCase method of Stringis used to make String
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        // toLowerCase method of String makes all letters lower case

        System.out.println(s1.toLowerCase());

        // store your name into variable
        // print your name in all uppercases:
        // you may optionaly concatenate "My Name is : "
        // print your name in all lowercase:
        // YOU MAY CONCATENATE "MY NAME IS :    "

        String myName = "Vladislav";
        System.out.println("my name is : " + myName.toLowerCase());
        System.out.println("MY NAME IS : " + myName.toUpperCase());

        // to count how many characters we have inside the String
        // we can use the Length method of String
        // it will count each and every

        int length = myName.length();
        System.out.println(myName.length());
        System.out.println(length);
        if (length > 4) {
            System.out.println("The name is londer than 4 simbols");
        } else {
            System.out.println("Name is short");
        }

    }

}
