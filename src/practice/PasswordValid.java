package practice;

import javax.swing.*;

public class PasswordValid {
    public static void main(String[] args) {
        System.out.println(passwordValidator("HelloWorld_86"));
    }

    public static boolean passwordValidator(String str) {
        boolean length = str.length() > 8;
        boolean lower = str.matches(".*[a-z].*");
        boolean upper = str.matches(".*[A-Z].*");
        boolean number = str.matches(".*[0-9].*");
        boolean special = str.matches(".*[!@.,#$_?-].*");

        return length && lower && upper && number && special;
    }
}
