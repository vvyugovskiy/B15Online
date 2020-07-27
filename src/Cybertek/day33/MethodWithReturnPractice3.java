package Cybertek.day33;

/**
 * Method with return type practice
 *
 * @author Akbar
 */
public class MethodWithReturnPractice3 {

    public static void main(String[] args) {

        System.out.println(calculateAgeFromBirthYear(1999));
        int[] allYears = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};
        for (int i = 0; i < allYears.length - 1; i++) {
            System.out.println(allYears[i] + " year born. Age is : " + calculateAgeFromBirthYear(allYears[i]));
        }
    }

    /*
    calculateAndReturnAge
     */
    public static int calculateAgeFromBirthYear(int birthYear) {
        // i want to take out negative scenarios first and just return 0
        if (birthYear <= 1900 || birthYear >= 2020) {
            return 0;
        }
        // If i reach this point, it means the birth year is valid
        return 2019 - birthYear;
    }
}



