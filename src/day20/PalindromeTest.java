package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        // if ypu reverse a String and if reversed one is the same
        // print out ITS A PALINDROME
        // kayak, level, elle, madam, aziza

        String name = "Kayak";
        String reversedName = "";
        for (int x = name.length() - 1; x >= 0; x--) {
            reversedName = reversedName + name.charAt(x);
        }

        // make this code does not care about spaces

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("Palindrom Test Has Passet");
        }else{
            System.out.println("Palindrom Has Failed");
        }
    }
}
