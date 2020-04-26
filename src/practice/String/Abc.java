package practice.String;

public class Abc {

    public static String alphabetical(String str) {
        int j = 0;
        String abc = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i - 1) && str.charAt(i) > abc.charAt(j)) {
                j++;
                abc += str.charAt(i) + "";
            }
        }
            return abc;
        }
        public static void main (String[]args){
            System.out.println(alphabetical("dslknklbhgfh"));
        }
    }
