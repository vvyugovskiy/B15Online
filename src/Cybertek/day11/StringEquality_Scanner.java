package Cybertek.day11;

        import java.util.Scanner;

public class StringEquality_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your Programming Language");
        String name = scan.next();
        if (name.equals("Cybertek")) {
            System.out.println("Great Language JAVA");
        } else if (name.equals("Selenium")) {
            System.out.println("Try to study Selenium");
        } else if (name.equals("Phyton")) {
            System.out.println("Even better with Phyton");
        } else {
            System.out.println("Try to study MORE");
        }
    }
}
