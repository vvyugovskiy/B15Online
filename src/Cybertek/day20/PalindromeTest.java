package Cybertek.day20;

public class PalindromeTest {
    public static void main(String[] args) {

        // if you reverse a String and if reversed one is the same
        // print out ITS A PALINDROME
        // kayak, level, elle, madam, aziza

        String name = " Marge let a moody baby doom a telegram.";
        String reversedName = "";
        String name1 = name.toLowerCase().replaceAll("\\W","");
        System.out.println(name1);
        for (int x = name1.length() - 1; x >= 0; x--) {
            reversedName += name1.charAt(x);
        }

        // make this code does not care about spaces

        if (name1.equalsIgnoreCase(reversedName)) {
            System.out.println("Palindrome Test Has Passed");
        }else{
            System.out.println("Palindrome Has Failed");
        }

        System.out.println(name);
    }
}
