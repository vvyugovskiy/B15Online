package practice.loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int apples = 1;
        int totalApples = 10;
        do {
            System.out.println("Eating an apple - " + apples);
            apples++;
            // int totalApples=10;
            // }while (apples<=totalApples);
        } while (apples <= totalApples);
        System.out.println("No more apples :( ");

    }
}
