package practice.String;


public class ReverseWordKeepSpaces {

    public static void main(String[] args) {

        reverseKeepSpaces("Java J2EE Java JSP J2EE");
    }

    public static void reverseKeepSpaces(String s) {

        String[] words = s.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            reversedString += reversedWord + " ";
        }
        System.out.println(reversedString);

    }
}
