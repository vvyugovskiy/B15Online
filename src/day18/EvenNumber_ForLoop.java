package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        // skip counting by 2
        // starting with 0

        for (int i = 2; i <= 10; i += 2) {

            System.out.print(i + " ");
        }
        // skip counting by 3
        System.out.println();
        for (int y = 0; y < 10; y += 3) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int y = 0; y < 10; y++) {
            System.out.print(y + " WUZ UP : ");
        }

        for (int x = 0; x < 10; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + " FIZZ BUZZ NUMBER");
            }
        // everything you ca ndo with the for loop -->> could be done using while loop!!!

        }

    }
}
