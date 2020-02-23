package day21;

public class OddPrinter {
    public static void main(String[] args) {

        // count from 1-10 --> print only odd numbers
        // repeat this 4 times

        for (int x = 1; x <= 4; x++) {
            System.out.println("Iteration : " +x);
            for (int y = 1; y <= 10; y++) {
                if (y % 2 != 0) {
                    System.out.print(y+ " ");
                }
            }
            System.out.println();
        }
    }
}
// count from 1-4
// print it 5 time
//1234
//1234
//1234
//1234

//count from 1-1   1
//count from 1-2   12
//count from 1-3   123
//count from 1-4   1234
//count from 1-5   12345
//do it 5 times