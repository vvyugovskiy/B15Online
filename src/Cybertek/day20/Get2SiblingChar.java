package Cybertek.day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
// given a String with even numbers correctors,
        // print out 2 chars. in one line
        //     01234567
        // Ex. Ayra
        // Ay 02
        // yr 23
        // ra 34

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(1,3));
//        System.out.println(name.substring(2,4));


        String name = "Aryan";

        for (int x = 0; x <= name.length() - 3; x +=1) { // shifts 1 letter
            System.out.print(name.substring(x, x + 3) + " "); // prints out by 2 letters
        }
    }
}
