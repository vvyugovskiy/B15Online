package day21;

public class NumberStaircase {


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
public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            // System.out.println("x : " + x);
            for (int y = 1; y <= x; y++) {
                System.out.print(y+" ");
            }
            System.out.println();

//        for (int y = 1; y <=2 ; y++) {
//            System.out.print(y);
//        }
//        System.out.println();
//        for (int y = 1; y <=3 ; y++) {
//            System.out.print(y);
//        }
//        System.out.println();
//        for (int y = 1; y <=4 ; y++) {
//            System.out.print(y);
//        }
//        System.out.println();
//        for (int y = 1; y <=5 ; y++) {
//            System.out.print(y);
//        }
//        System.out.println();
        }
    }
}