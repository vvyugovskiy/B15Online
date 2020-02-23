package replit.$_151_200;

public class MethodsWithString1MergeThem_178 {
    public static void main(String[] args) {

        String one = "wooden";
        String two = "spoon";
        String newString = "";
        int longest = (one.length() > two.length()) ? one.length() : two.length();
        for (int i = 0; i < longest; i++) {
            if (i < one.length()) {
                newString += one.charAt(i);
            }
            if (i < two.length()) {
                newString += two.charAt(i);
            }
        }
//        for (int i = 0; i < one.length() || i < two.length(); i++) {
//            if (i < one.length())
//                newString += one.charAt(i);
//
//            if (i < two.length())
//                newString += two.charAt(i);
//        }
        System.out.println(newString);
        ;
    }
}
