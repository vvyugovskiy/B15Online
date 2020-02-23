package replit.$_001_050;

import java.util.Scanner;

public class IfStatementGrades_049 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int grade = s.nextInt();

        if (grade>90){
            System.out.println("exelent");
        }else if (grade>60 && grade <90){
            System.out.println("good");
        }else if (grade >60 && grade < 70){
            System.out.println("pass");

        }else if (grade < 60){
            System.out.println("fail");
        }
    }
}
