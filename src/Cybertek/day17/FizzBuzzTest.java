package Cybertek.day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        // if the number can be divided by 3 and 5 --> FizzBuzz mumber
        // if the number can be divided by 5  --> Fizz mumber
        // if the number can be divided by  3 --> Buzz mumber
//        int num = 15;
//        if (num%3==0 && num%5==0){
//            System.out.println(num+" is FizBuzz Number");
//        }else if (num%5==0){
//            System.out.println(num+" is Fizz Number");
//        }else if (num%3==0) {
//            System.out.println(num + " is Buzz Number");
//        }else{
//            System.out.println("Not A FIZZBUZZ Number");
//        }

        int num = 1;
        while (num <= 50) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is FizBuzz Number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is Fizz Number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is Buzz Number");

            }
            ++num;
        }
    }
}

