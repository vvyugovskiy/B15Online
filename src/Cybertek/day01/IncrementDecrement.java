package Cybertek.day01;

public class IncrementDecrement {
    public static void main(String[] args) {

        int apples = 0;
        System.out.println(apples);
        System.out.println(++apples);
        System.out.println(apples);
        System.out.println(apples++);
        System.out.println(apples);
        apples--;
        System.out.println(apples);
        System.out.println(--apples);

int pears = 3;

            //   4   * 5  / 4   3  +   2  =>
int basket = ++pears * 5 / pears-- + --pears;
        System.out.println(basket);
        System.out.println(pears);


        int counter = 10;
        counter = counter + 1;
        counter++;

        System.out.println(counter);


    }
}
