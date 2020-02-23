package replit.$_101_150;

import java.util.Scanner;

public class ArraysAverageTemperature_128 {
    public static void main(String[] args) {
//        Given an array temps of doubles, containing temperature data, compute the average temperature.
//        Store the average in a variable called avgTemp.
//        Besides temps and avgTemp, you may use only two other variables --
//        an int variable k and a double variable named total, which have been declared.

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};


        for (int x = 0; x < temps.length; x++) {
            total+=temps[x];
        }
        avgTemp = total/temps.length;
        System.out.println(avgTemp);
    }
}
