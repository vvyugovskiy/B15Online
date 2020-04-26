package practice.String;

import practice.*;

public class Permutation2 {

    public static void main(String[] args) {

        String s = "Vladislav";
        int n = s.length();
//        int c = n!
        Permutation2 permutation2 = new Permutation2();
        permutation2.calculate(s, 0, n - 1);
        System.out.println(Factorial.factorial(n));
    }

    private void calculate(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                String swapped = this.swap(str, left, i);
                this.calculate(swapped, left + 1, right);
            }
        }
    }
    private String swap(String str, int i, int j) {

        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
