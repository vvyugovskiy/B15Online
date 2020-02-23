package day18;

public class DoWhileAtLeastRunsOnce {
    public static void main(String[] args) {
        /*
        while loop check the condition first then enter the statement
        do while loop will act at least once
        DO WHILE LOOP ALWAYS RUNS AT LEAST ONE ITERATION
         */

        int x = 1000;
        do {
            System.out.println("KEEP GOING");

        }while (x<5);
        System.out.println("THE END");

        while(x<5){
            System.out.println("KEEP GOING IN WHILE");
        }
    }
}
