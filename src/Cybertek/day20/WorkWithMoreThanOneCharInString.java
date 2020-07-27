package Cybertek.day20;

public class WorkWithMoreThanOneCharInString {
    public static void main(String[] args) {
        // given a String with even numbers correctors,
        // print out 2 chars. in one line
        //     01234567
        // Ex. Gokyuzum
        // Go 01
        // ky 23
        // uz 45
        // um 67

//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));

//        int x=0;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
        // condition is x <=charCount-2

        String name = "Gokyuzum";
        int charCount = name.length();
        for (int x = 0; x <= charCount - 2; x += 2) {
            System.out.print(name.substring(x, x + 2)+ " ");
        }
    }
}
