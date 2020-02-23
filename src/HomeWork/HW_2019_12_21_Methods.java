package HomeWork;

import java.util.Scanner;

public class HW_2019_12_21_Methods {
    public static void main(String[] args) {

        reversePrintMyOwnName();
        reversePrintAnyName();
//        *create a method that has 1 String parameter called name
//        and print that name in reversed order
//        printLastCharacterOfName();
//        *create a method that has 1 String parameter called name
//        and print last character of that name
//        printFullNameInformation();
//        *create a method that has 2 String parameter called firstName, lastName
//        and print "Your first name is firstName , Your last Name is lastName
//        print " your full name lenth is lengthOfTheFullName"
//        compareNameCharacterCount();
//        * create a method that has 2 String parameter called name1, name2
//        if name 1 has more characters
//        print " name 1 is longer "
//        if name 2 has more characters
//        print " name 2 is longer "
//        if name 2 has same character count
//        print " name 1 and name 2 same character count "
//        printAtoZ();
//                * create a method that has no parameter
//        and print A - Z in one line
//        printZtoA();
//        *create a method that has no parameter
//        and print Z - A in one line
//        printAlphabetInRange();
//        *create a method that have 2 char as parameters:
//        beginning, ending
//        if beginning character is before ending character
//        for example beginning A, ending D-- >> ABCD
//        if beginning character is after ending character
//        for example beginning D, ending A-- >> DCBA
    }

    public static void reversePrintMyOwnName() {
        String myName = "Vladislav";
        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.print(myName.charAt(i)+" ");

        }
    }

    public static void reversePrintAnyName() {
        Scanner scan = new Scanner(System.in);
        String anyName = scan.next();
        for (int i = anyName.length() - 1; i >= 0; i--) {
            System.out.print(anyName.charAt(i)+" ");
        }
    }
}
