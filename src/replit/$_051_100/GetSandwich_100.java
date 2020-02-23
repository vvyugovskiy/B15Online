package replit.$_051_100;

import java.util.Scanner;

public class GetSandwich_100 {
    public static void main(String[] args) {

// A sandwich is two pieces of bread with something in between.
// Print the string that is between the first and last appearance of "bread"
// in the given string, or return string "nothing" if there are not two pieces of bread.

        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        int breadFirst = str.indexOf("bread");
        int secondBread = str.lastIndexOf("bread");
        if (breadFirst!=secondBread){
            System.out.println(str.substring(breadFirst+5,secondBread));
        }else{
            System.out.println("nothing");
        }



    }
}
