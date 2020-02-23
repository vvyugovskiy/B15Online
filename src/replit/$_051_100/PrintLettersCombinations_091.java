package replit.$_051_100;

public class PrintLettersCombinations_091 {
    public static void main(String[] args) {

//        Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
//        The combinations should be displayed in descending alphabetical order:
//        zz
//        zy
//        zx
//        zw
//        zv
//        yz
//       ....
//        vv
        int countx = 0;
       // int county = 0;

        for (char x = 'z'; x >= 'v'; x--) {
           countx ++;
            for (char y = 'z'; y >= 'v'; y--) {
                System.out.println("" + x + y);
                countx++;
            }
        }
        System.out.println(countx);
    }
}
