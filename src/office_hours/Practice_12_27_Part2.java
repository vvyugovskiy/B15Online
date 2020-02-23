package office_hours;

import java.util.Arrays;

public class Practice_12_27_Part2 {

    public static void main(String[] args) {

        oddOrEver(345);
        oddOrEver(0);
        System.out.println(KmToMiles(1));
        System.out.println(GallonsToLitters(1));

        int[] array = {2, 3, 1, 5, 10, 18, 19, 20};
        DescOrder(array);

        calculate(10, 5, "+");
        calculate(10, 5, "_");
        calculate2(9, 3, '*');
        calculate2(9, 3, '=');
        GradeCalculate(97);
        GradeCalculate(140);
    }

    // write a mrthod that can verify any number it it's even or odd
    public static void oddOrEver(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
            return;
        }
        System.out.println(number + " is odd number");
    }

    //    1. write a method that can convert km to miles
//    Hint: 1 km = 0.612 miles
    public static double KmToMiles(double km) {
        double miles = km * 0.612;

        return miles;
    }

    //2. write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L
    public static double GallonsToLitters(double gallons) {
        double Litters = gallons * 3.75;

        return Litters;
    }

    //3. write a method that can print out the array in Descending order
    public static void DescOrder(int[] array) {
        // [2,3,1,5]
        Arrays.sort(array); // [1,2,3,5]
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //4. write a method that accepts 3 parameters: 2 numbers and one operator,
    //	 	and prints out the calculation
    //		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    //			Ex: calculate(10, 2, "*") ==> 20;
    //				calculate(20, 2, "~") ==> invalid operator
    public static void calculate(int a, int b, String operators) {
//        boolean result = !operators.equals("-") || !operators.equals("+") || !operators.equals("*")
//                || !operators.equals("/") || !operators.equals("%");
//        if (!result) {
//            System.out.println("Invalid operator");
//            return;
//        }
        if (operators.equals("-")) {
            System.out.println(a - b);
        } else if (operators.equals("+")) {
            System.out.println(a + b);
        } else if (operators.equals("*")) {
            System.out.println(a * b);
        } else if (operators.equals("/")) {
            System.out.println(a / b);
        } else if (operators.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid operator");
        }
    }

    public static void calculate2(int a, int b, char operators) {

        switch (operators) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    //5. write a method that can calculate grade
    //					if score is 100 ~ 90 ==> A
    //					if score is 89 ~ 80 ==> B
    //					if score is 79 ~ 70 ==> C
    //					if score is 69 ~ 60 ==> D
    //					if score is 0 ~ 59 ==> F
    //					otherwise ==> Invalid Score
    public static void GradeCalculate(int grade) {
        if (grade <= 100 && grade >= 90) {
            System.out.println("A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("C");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Score");
        }
    }
}
