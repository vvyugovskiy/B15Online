package practice.String;

public class CombinedString {


    public static void main(String[] args) {

        System.out.println(mixString("hello","again"));

        System.out.println(countA("hahahahaah"));
    }

    protected static String mixString(String s1, String s2) {
        int length = 0;
        String combined = "";
        if (s1.length() <= s2.length()) {
            length = s1.length();
        } else {
            length = s2.length();
        }
        for (int i = 0, j = 0; i <= length; i++) {
            if (i<s1.length()){
                combined+=s1.charAt(i);
            }
            if (i<s2.length()){
                combined+=s2.charAt(i);
            }
        }
        return combined;
    }
    protected static int countA (String s)
    {
        int count = 0;
        s=s.toLowerCase();
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
