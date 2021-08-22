package practice.String;

import java.util.Arrays;

public class SSNChecker {
    public static void main(String[] args) {
        System.out.println(ssnChecker("a52-a4-5477"));
        System.out.println(ssnChecker("759-44-5477"));
        System.out.println(ssnChecker("75-44-5477"));
        System.out.println(ssnChecker("876-456-3457"));
        System.out.println(ssnChecker("567-12-809"));
    }
    public static boolean ssnChecker(String str){
        String [] ssn = str.split("-");
        if (ssn[0].length()!=3 || !ssn[0].matches("\\d+")) return false;
        if (ssn[1].length()!=2 || !ssn[1].matches("\\d+")) return false;
        return ssn[2].length() == 4 && ssn[2].matches("\\d+");
    }
}
