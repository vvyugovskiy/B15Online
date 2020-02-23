package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {

        // count 1-5
        // repeat 10 times
        for (int x = 1; x <= 3; x++) {
            System.out.println("ITERATION : "+x);

            for (int y = 1; y <= 5; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
