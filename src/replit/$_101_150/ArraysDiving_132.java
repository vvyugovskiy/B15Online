package replit.$_101_150;

import java.util.Scanner;

public class ArraysDiving_132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        float sum = 0;
        float min = score[0];
        float max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            }
            if (score[i] > max) {
                max = score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {

            if (score[i] != max && score[i] != min) {
                sum = sum + score[i];
            }

        }
        float total = sum * difficulty * 0.6f;
        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
