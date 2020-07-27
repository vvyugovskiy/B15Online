package practice.String;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        isAnagram("Dormitory", "Dirty Room");
        isAnagram("SiLeNt CAT", "LisTen AcT");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String a = "listen";
        String b = "silent";

        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        if (a.length() != b.length()) {
            System.out.println("not anagram");
            System.exit(0);
        }

        for (int i = 0; i < a.length(); i++) {

            b = b.replaceFirst(a.charAt(i) + "", "");
//            System.out.println(b);
        }

        if (b.isEmpty()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        // print(b.isEmpty() ? "Anagram" : "Not Anagram")

    }

    public static void isAnagram(String s1, String s2) {
        String ss1, ss2 = "";
        boolean check = false;
        ss1 = s1.toLowerCase().replace(" ", "");
        ss2 = s2.toLowerCase().replace(" ", "");
        if (ss1.length() != ss2.length()) {
            System.out.println("not anagram");
        } else {
            char[] ar1 = ss1.toCharArray();
            char[] ar2 = ss2.toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            check = Arrays.equals(ar1, ar2);
            System.out.println(check);
        }
    }
}