package day07;

public class PostIncreasementPreIncreasement {
    public static void main(String[] args) {

        int apple = 8;
        apple++; // increment by one --> 9
        System.out.println(apple);  // printing increased value 9


        System.out.println(apple++); // would not print the increased value this time, only next time!
        System.out.println(apple);  // would print increased value NOW!

        int score = 50;

        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);





    }
}
