package replit.$_101_150;

import java.util.Scanner;

public class EqualsJavaPython_101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
       // Given a string, print out true if the number of appearances of "java"
        // anywhere in the string is equal to the number of appearances of "python"
        // anywhere in the string (case sensitive).
        int countJava = 0;
        int countPython = 0;
        while (sentence.contains("java")){
            sentence=sentence.substring(sentence.indexOf("java")+4);
            countJava++;
        }
        while (sentence.contains("python")){
            sentence=sentence.substring(sentence.indexOf("python")+6);
            countPython++;
        }
        System.out.println(countJava==countPython);
    }
}
