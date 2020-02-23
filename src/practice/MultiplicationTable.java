package practice;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int x = 1; x <= 12; x++) {
            System.out.println("Multiplier " + x);
            for (int y = 1; y <= 12; y++) {
                int z = x * y;
                System.out.println(x + " x " + y + " = " + x * y);
            }
            System.out.println();
        }
    }
}
