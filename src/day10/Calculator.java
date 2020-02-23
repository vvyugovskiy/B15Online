package day10;

public class Calculator {
    public static void main(String[] args) {
        char operator='%';

        switch (operator){
            case '+':
                System.out.println("You are about to add numbers");
                break;
            case '/':
                System.out.println("You are about to devide numbers");
                break;
            case '-':
                System.out.println("You are about to minus numbers");
                break;
            case '*':
                System.out.println("You are about to multiply numbers");
                break;
            case '%':
                System.out.println("You are about to find numbers remainder");
                break;
            default:
                System.out.println("Something else is about to heppen!");
        }
        System.out.println("Your operator is "+operator);
    }
}
