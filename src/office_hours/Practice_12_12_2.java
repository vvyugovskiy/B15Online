package office_hours;

public class Practice_12_12_2 {
    public static void main(String[] args) {

//        Tasks:
//        1.  Write a program that can print out the unique values from an int Array
//        Ex:
//        if arr -> {1,1,2,3,3}
//        output: 2

        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8};
        int count = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(numbers[j] + " ");
            }
            count = 0;
        }
//        2. Write a program that can print out the unique values from  String Array
//        Ex:
//        if arr -> {"a" , "a ", "b", "c", "c"}
//        output: b
        String[] array = {"A", "A", "B", "C", "C", "D", "E"};  // excepted result: BDE


        for (int j = 0; j < array.length; j++) {
            int count2 = 0;  // to store the number of apperence
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(array[j])) {
                    count2++;
                }
            }

            if (count2 == 1) {
                System.out.println(array[j]);
            }
        }

//        3. Write a program that can find the second max number from an int array
//        Ex:
//        if arr -> { 1,2,3,4,5}
//        output: 4
//        DO NOT use sort method
        int[] grades = {1, 2, 3, 4, 5, 6, 7, 8};  // expected result: 7

        int max = grades[0];

        for (int eachGrade : grades) {
            if (eachGrade > max) {
                max = eachGrade;
            }
        }

        System.out.println(max);

        int secondMax = grades[0];
        for (int eachGrade : grades) {
            if (eachGrade == max) {
                continue;
            }

            if (eachGrade > secondMax) {
                secondMax = eachGrade;
            }
        }
        System.out.println("Second max number: " + secondMax);

//        4. Swap two variable' values without using a temporary variable
//        Ex:
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10

        int a = 10, b = 20;
        //
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Result: " + a + " " + b);

        // Assignment: write program that can deide two numbers without / operator and remainder operator %
    }
}