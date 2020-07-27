package Cybertek.day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        // create a long array or 5 items called salaries
        // put your salary amounts
        // use for each loop to irerate over them
        //and print them out
        // print out only the salary more than 100K
        long[] salaries = {125, 160, 98, 60, 175};

        long max = salaries[0];                            // finding a max number in Array

        for (int i = 0; i < salaries.length; i++) {        //

            if (salaries[i] > max) {                       //
                max = salaries[i];                         //
            }
        }

        for (double eachSal : salaries) {
            // System.out.println("Each Salary = " + eachSal);
            if (eachSal<100){   // print eny that more than 100K
                continue;

            }
            System.out.println("Salary "+eachSal);
        }
        System.out.println("Max : " + max);

    }
}
