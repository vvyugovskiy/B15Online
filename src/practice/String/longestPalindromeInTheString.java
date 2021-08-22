package practice.String;

public class longestPalindromeInTheString {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("snbdannagnolrnjsl"));
        System.out.println(longestString("snbdannagnolrnjsl"));
    }

    public static boolean checkIfPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String longestString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (checkIfPalindrome(str.substring(i, j + 1))) {
                    if (str.substring(i,j+1).length()>result.length()) {
                        result=str.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }


//    public static String longestPalindrome(String str) {
//        String result = "";
//        for (int i = 0; i<str.length();i++){
//            for (int j=i; j<str.length();j++){
//                if (isPalindrome(str.substring(i,j+1))){
//                    if (str.substring(i,j+1).length()>result.length()){
//                        result=str.substring(i,j+1);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//    public static boolean isPalindrome(String str) {
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
//    }
}
