package day21;

public class SkipAll5s {
    public static void main(String[] args) {
        // count 1-100
        // skip all numbers divisible by 5
        // x % 5 == 0
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.println("SKIPPING " + x);
                continue;
            }
            System.out.println(x);
        }
//         WITHOUT CONTINUE STATEMENT
//        for (int x = 1; x <= 100; x++) {
//            if (x % 5 != 0) {
//                System.out.println(x);
//            } else {
//                System.out.println("Skipping "+x);
//            }
//
//        }

    }
}
