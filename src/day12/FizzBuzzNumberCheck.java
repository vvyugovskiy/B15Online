package day12;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        int num =11;
        if (num%5==0 && num%3==0){
            System.out.println("FizzBuzz Number");
        }else if (num%3==0){
            System.out.println("it Buzz number");
        }else if (num%5==0){
            System.out.println("it Fizz number");
        }else{
            System.out.println("No Really...");
        }
    }
}
