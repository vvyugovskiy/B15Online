package practice.DataStructuresAndAlgorithms.C_Stack;

import java.util.LinkedList;

public class StackChallenge {
    // check if Palindrome using Stack method
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }
    public static boolean checkForPalindrome(String string){
        string = string.toLowerCase();
//         string = string.toLowerCase().replaceAll("\\W","");
//         for (int i=0; i<string.length()/2;i++) {
//             if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for (int i = 0; i< lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if (c>='a' && c <='z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
