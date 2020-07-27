package Cybertek.day15;

public class ReversingAString {
    public static void main(String[] args) {

        String name = "Akbar";
        System.out.println(name.charAt(0) +" "+name.charAt(1)+" "+name.charAt(2)+" "+name.charAt(3)+" "+name.charAt(4));
        System.out.println(name.charAt(4) +" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));



        int charCount = name.length();
        //counting starts with 1
        // counting index (location) starts with 0
        // so last character will always be one less than actual character count

        int lastCharIndex = charCount -1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("LAST CHAR NUMBER IS : "+lastCharIndex);
        System.out.println("LAST CHARACTER IS : "+lastChar);

        ///    OR

        System.out.println("LAST CHARACTER IS : "+name.charAt((name.length()-1)));
    }
}
