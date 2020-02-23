package day10;

public class Answer {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 454380;
        if ((myNumber%5)==0) {
            myAnswer = "a Fizz Number";
        }else {
            myAnswer = "not a Fizz Number";
        }
        System.out.println("My number " +myNumber+" , It is "+myAnswer);
    }
}
