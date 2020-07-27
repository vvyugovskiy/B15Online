package Cybertek.day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double [] prices = new double [5];
        System.out.println(prices[0]);
        //can not print out array variable directly
        // to see whats inside

        // System.out.println(prices);
        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // Create a Char array that hold all the letters from your first name
        // and assign values using each characters of your first name
        // then print out each character
        char [] nameChar = new char [9];
        nameChar[0]='V';
        nameChar[1]='L';
        nameChar[2]='A';
        nameChar[3]='D';
        nameChar[4]='I';
        nameChar[5]='S';
        nameChar[6]='L';
        nameChar[7]='A';
        nameChar[8]='V';
        for (int i = 0; i <=8 ; i++) {
            System.out.print(nameChar[i]);

        }
        System.out.println(nameChar);
    }
}
