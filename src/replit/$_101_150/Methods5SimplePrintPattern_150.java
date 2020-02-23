package replit.$_101_150;

public class Methods5SimplePrintPattern_150 {

    //Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

    public static void printHollowRect() {
// Way #1:
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

// Way #2:    // Nice approach  BUT Don't work
//        for (int i=0; i<5; i++) {
//            System.out.print("*");
//            for (int k=0; k<5; k++) {
//                switch (k) {
//                    case 0:
//                    case 4: System.out.print("*"); break;
//                    default: System.out.print(" ");
//                }
//                System.out.println("*");
//            }
//        }
    }

    public static void main(String[] args) {

        printHollowRect();
    }
}