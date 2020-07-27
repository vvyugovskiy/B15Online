package Cybertek.day06;

public class CompoundOperator2 {
    public static void main(String[] args) {

        // Assignment Operator _ will save the result of whatever operation on right to the left side variable!
        // +=. -=. /=. *=

        int studentOnline = 263;

        // studentOnline = studentOnline+5;
        studentOnline += 5;

        System.out.println("Student online " + studentOnline);

        //  studentOnline = studentOnline-3;
        studentOnline -= 3;
        System.out.println("Student online " + studentOnline);

        studentOnline *= 2;
        // studentOnline = studentOnline + studentOnline;
        System.out.println("Student online " + studentOnline);

        // studentOnline = studentOnline/3;
        studentOnline /=3;
        System.out.println("Count droped to 1/3 " +studentOnline);




    }
}
