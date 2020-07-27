package Cybertek.day26;

public class ArrayTask_NumberTest {

    // 1. given an int array
    // write a program to test all the element in this int array are more than 100

    public static void main(String[] args) {
        int [] scores = {156, 101, 76, 187, 87, 110};

        // create a variablr finalResult to store
        // your result of checking if every number in this array is more than 100 orr not

        String finalResult = ""; //if all numbers are more than 100 then make it yes, if not make it no

        // LOGIC 1:
        // take each item and check if it's more than 100, and count. In the end if the count is more less than 6, answer is NO

        int count=0;
        for (int eachNum : scores) {
            if (eachNum>100) {
                System.out.println("each num = " + eachNum);
                count++;
            }
        }
        System.out.println(count);
        if (count==scores.length){
            finalResult = "Yes";
        }else{
            finalResult="No";
        }
        System.out.println(finalResult);

        // LOGIC 2 :
        // Check each item and break when number is less than 100  after assigning final result to NO
        String result = "Yes";
        for (int eachN : scores) {
            if (eachN <100) {
                result="No";
                break;
            }
        }
        System.out.println(result);

        // LOGIC 3 :
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes
    }
}
