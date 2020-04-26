package practice.String;

public class Palindrom {
    public static void main(String[] args) {

        String s = "was it a car or a cat I saw";
        String sReversed = "";
        String s1 = s.toLowerCase().replaceAll(" ", "");
        for (int i = s1.length() - 1; i >= 0; i--) {
            sReversed += s1.charAt(i);
        }
        if (s1.equals(sReversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
