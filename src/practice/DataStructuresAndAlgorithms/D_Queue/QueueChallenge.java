package practice.DataStructuresAndAlgorithms.D_Queue;

import replit.$_101_150.ArraysSplitEmail_119;

import java.util.LinkedList;

public class QueueChallenge {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }
    public static boolean checkForPalindrome(String string) {
//        "dade"
//                stack(LIFO): push(d), push(a), push(d), push(e) : d, a, d, e  -> when pop -> : e, d, e, d
//                queue(FIFO): add(d), add(a), add(d), add(e) : d, a, d, e  -> when remove -> : d, a, d, e
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }
        return true;
    }
}
