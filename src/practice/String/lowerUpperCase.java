package practice.String;

public class lowerUpperCase {

    public static void main(String[] args) {

        String s = "gfkgbnlLKGlgfd";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(s.substring(i, i + 1).toLowerCase());
            } else {
                System.out.println(s.substring(i, i + 1).toUpperCase());
            }
        }
    }
}
