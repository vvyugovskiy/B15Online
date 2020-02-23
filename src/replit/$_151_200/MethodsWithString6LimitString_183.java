package replit.$_151_200;

public class MethodsWithString6LimitString_183 {
    public static String limit(String text, int maxLength) {
        String result = "";
        for (int i = 0; i < maxLength; i++) {
            result+=text.charAt(i);
        }
        return result;
    }
}
