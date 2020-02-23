package day10;

public class Calculator_v2 {
    public static void main(String[] args) {
        // int num1, num2 - asssign values
        // char - operator
        //print the result of the operation
        int num1 = 20;
        int num2 = 10;
        char operator = '/';
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                    System.out.println("invalid Operator");

        }


    }
}
