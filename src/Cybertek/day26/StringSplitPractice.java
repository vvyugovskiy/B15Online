package Cybertek.day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        // spell the name of each person in this format
        // A-b-b-o-s .......

        // students = students.replace(" ", "");  // replacing Spaces with Nothing ("")
        String[] arrST = students.split(",");
        System.out.println(Arrays.toString(arrST));

        for (String eachStudent : arrST) {
            for (int i = 0; i < eachStudent.trim().length(); i++) {
                if (i != eachStudent.trim().length()-1) {
                    System.out.print(eachStudent.trim().charAt(i) + "-");
                }else{
                    System.out.print(eachStudent.trim().charAt(i));
                }
            }
            System.out.println();
        }
    }
}
