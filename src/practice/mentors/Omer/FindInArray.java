package practice.mentors.Omer;

public class FindInArray {

    public static void main(String[] args) {

        int[][] testCase = {{-99, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 12345, 5, 5, 5, 5},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99},
                {10, 20, 30, 40, 50, 10, 10, 40, 30, 20, 10},
                {32767},
                {255, 255},
                {9, 10, -88, 100, -555, 1000},
                {10, 10, 10, 11, 456, 10, 10, 2, 2, 2, 2, 2, 2,},
                {-111, 1, 2, 3, 9, 11, 20, 30},
                {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989},
                {12, 12, 15, 18, 21, 23, 1000},
                {250, 19, 17, 15, 13, 13, 13, 13, 11, 10, 9, 6, 3, 2, 1, 1},
                {9, 10, -8, 10000, -5000, 1000}};

        for (int i = 0; i < testCase.length; i++) {
            System.out.println(answerQuestion(testCase[i]));
        }
    }

    public static int answerQuestion(int[] myArray) {
        int maxAmount = countMyNumber(myArray, myArray[0]);
        int maxValue = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (countMyNumber(myArray, myArray[i]) > maxAmount) {
                maxAmount = countMyNumber(myArray, myArray[i]);
                maxValue = myArray[i];
            }
        }
        return maxValue;
    }

    public static int countMyNumber(int[] arr, int targetNumber) {
        int count = 0;
        for (int eachNumber : arr) {
            if (eachNumber == targetNumber) {
                count++;
            }
        }
        return count;
    }
}