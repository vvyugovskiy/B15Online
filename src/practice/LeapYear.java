package practice;

public class LeapYear {

    public static void main(String[] args) {

        int[] arr = {1999, 2020, 2014, 3201, 900, 1776, 800, 1000};
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Is "+arr[i]+" a Leap Year : "+isLeapYear(arr[i]));
            if ((arr[i] % 400 == 0 || (arr[i] % 4 == 0 && arr[i] % 100 != 0))) {
                System.out.println(arr[i] + " is leap year");
//                lst.set(1, 29);
            } else {
                System.out.println(arr[i] + " in not leap year");
            }
        }
    }

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
        }
        return year % 4 == 0;
    }
}