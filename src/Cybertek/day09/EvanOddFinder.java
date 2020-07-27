package Cybertek.day09;

public class EvanOddFinder {
    public static void main(String[] args) {

        int num = 207;
        int remainder = num % 2;
        // if (remainder == 0) {
        if (remainder%2==0) {
            System.out.println("Its an even number");
        } else {
            System.out.println("This is ODD number");
        }
        System.out.println("THE END");
    }
}