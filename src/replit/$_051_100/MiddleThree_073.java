package replit.$_051_100;

import java.util.Scanner;

public class MiddleThree_073 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
//        You have a word, do the following:
//        If the word has odd number of characters
//        and has 5 or more characters, print the middle three
//        characters of the word.
//        Otherwise print "invalid".
    if (word.length()>=5 && word.length()%2 !=0){
        System.out.println(word.substring((word.length()/2)-1,(word.length()/2)+2));
    }else {
        System.out.println("invalid");
    }

    }
}
