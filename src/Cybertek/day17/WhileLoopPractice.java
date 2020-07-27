package Cybertek.day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        // count 1 to 5 then 5 to 1
        // if i use (couner <=5) as condition i will have there
        // iteration 1: 1<=5 true
        //          print 1  counter = 2
        // iteration 2:  2<=5 true
        //          print 2 counter = 3
        // iteration 3:  3<=5 true
        //          print 3 counter = 4
        // iteration 4:  4<=5  true
        //          print 4 counter = 5
        // iteration 5:  5<=5 true
        //          print 5 counter = 6
        // 6<=5 false --> get out of the loop

        for (int counter = 1; counter <= 5; ++counter) {
            System.out.print(counter + " ");
        }
        for (int counter1 = 5; counter1 >= 1; --counter1) {
            System.out.print(counter1 + " ");
        }
        System.out.println();

        int counter = 1;
        while (counter <= 5) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        System.out.println("counter after increment = " + counter);  // at this point counter value is 6


        while (counter > 1) {
            --counter;
            System.out.print(counter + " ");

        }
        System.out.println();
        System.out.println("counter after increment = " + counter);

    }
}
