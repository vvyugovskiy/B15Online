package practice.CodingBat;

public class Warmup_2 {

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 3));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(countXX("Hexxxo thxxe"));
        System.out.println(doubleX("xaxxx"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringSplosion("Code"));

    }
//----------------------------------------------------------------------------------------------------------------

    public static String stringTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
//----------------------------------------------------------------------------------------------------------------

    public static String frontTimes(String str, int n) {

        String result = "";

        String part = "";
        if (str.length() >= 3) {
            part = str.substring(0, 3);
        } else {
            part = str;
        }
        for (int i = 0; i < n; i++) {
            result += part;
        }
        return result;
    }
//----------------------------------------------------------------------------------------------------------------

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    //----------------------------------------------------------------------------------------------------------------
    public static boolean doubleX(String str) {
        if (str.contains("x")) {
            String x = str.substring(str.indexOf("x"));
            return x.startsWith("xx");
        }
        return false;
    }

    //        boolean check = false;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if ((str.charAt(i) + "").equals("x")) {
//                if ((str.charAt(i + 1) + "").equals("x")) {
//                    check = true;
//                    // break;
//                } else {
//                    break;
//                }
//            }
//        }
//        return check;
//----------------------------------------------------------------------------------------------------------------
    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i) + "";
        }
        return result;
    }

    //----------------------------------------------------------------------------------------------------------------
    public static String stringSplosion(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }
}
