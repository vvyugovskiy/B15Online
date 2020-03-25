package replit.$_201_250;

public class MethodsWithString14Palindrome_203 {
    public static void main(String[] args) {

        System.out.println("isPalindrome(\"boobaaaboob\") = " + isPalindrome("boobaaboob"));
    }

    public static boolean isPalindrome(String check) {

        String reversed = "";
        String newCheck = "";
        newCheck = check.toLowerCase().replaceAll(" ", "");
        //System.out.println(newCheck);
        for (int i = newCheck.length() - 1; i >= 0; i--) {
            reversed += newCheck.charAt(i);
        }
        return reversed.equalsIgnoreCase(newCheck);
    }
}