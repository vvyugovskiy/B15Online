package practice.loop;

public class DoWhileLoopNumbersProgram {
    public static void main(String[] args) {
        int number = 1;
        int until = 17;
        do {
            System.out.print(number + ", ");
            number++;
        } while (number <= until);

        int number1 = 1;
        int until1 = 17;
        do {
            System.out.print(until1 + ", ");
            until1--;
        } while (until1 >= number1);

        int num = 5;

        do {
            System.out.print("&");
            num--;
            //} while (num >= 10);
        } while (num >= 0);

    }

}

