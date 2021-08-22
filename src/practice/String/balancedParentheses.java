package practice.String;

import java.util.regex.*;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.Stack;

public class balancedParentheses {

    public static char[][] TOKEN = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isOpenTerm(char c) {
        for (char[] array : TOKEN) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closeTerm) {
        for (char[] array : TOKEN) {
            if (array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            }else{
                if (stack.isEmpty() ||!matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
