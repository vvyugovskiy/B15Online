package HomeWork;

public class HW_2019_12_08_ARRAY_SUM_MIN_MAX_AVERAGE {
    public static void main(String[] args) {

//        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array

        int[] numbers = {17, 12, 5, 7, 90, 57};

        int sum = 0;
        int sumEvan = 0;
        int sumOdd = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int n = 0; n < numbers.length; n++) {            // creating the way to printout and use every number in an array
            System.out.println("Numbers : " + numbers[n]);
            sum += numbers[n];

            if (numbers[n] % 2 == 0) {
                sumEvan = sumEvan + numbers[n];
            } else if (numbers[n] % 2 != 0) {
                sumOdd = sumOdd + numbers[n];
            }

            if (numbers[n] > max) {                           // MAX NUMBER
                max = numbers[n];
            } else if (numbers[n] < min) {                    // MIN MUMBER
                min = numbers[n];
            }
        }

        System.out.println("Average of numbers :" + sum / numbers.length);
        System.out.println("Sum of Array Numbers = " + sum + " FOR METHOD");
        System.out.println("MAX Number = " + max);
        System.out.println("MIN Number = " + min);

        sum = 0;
        for (int y : numbers) {
            sum += y;
        }
        System.out.println("Sum of Odd Numbers = " + sumOdd);
        System.out.println("Sum of Even Numbers = " + sumEvan);
        System.out.println("Sum of Array Numbers = " + sum + " FOR EACH METHOD");
    }
}
