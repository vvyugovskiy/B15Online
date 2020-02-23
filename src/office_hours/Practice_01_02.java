package office_hours;

public class Practice_01_02 {

    public static void main(String[] args) {
        String str = "AABBDDEE"; // Expected result ABDE

        RemoveDuplicates("AABBCCDDEE");
        System.out.println(Frequency("AABBCC", 'C'));
        System.out.println(FrequencyOfChars("AAABBBBCCCAAA"));
    }

    public static String RemoveDuplicates(String str) {
        String result1 = "";// store non duplicates
        for (int i = 0; i < str.length(); i++) {
            if (!result1.contains(str.substring(i, i + 1))) {
                result1 += str.substring(i, i + 1);
//                if (!result1.contains("" + str.charAt(i))) ;
//                result1 += "" + str.charAt(i);
            }
        }
        System.out.println(result1);
        return result1;

    }

    //Task02: Frequency ("AAABBBBBB",'B') ==> 6
    public static int Frequency(String str, char ch) {

        int count = 0; //count how many time the char is occurred in a str
        char[] arr = str.toCharArray();//  ['A','B','C','A','B','C']
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    //Task03: FrequencyOfChars("AAABBBCCC") ==>A3B3C3
    public static String FrequencyOfChars(String str) {
       String result = "";
        String nonDup = RemoveDuplicates(str); // ABC
        for (int i = 0; i < nonDup.length(); i++) {
            int count = Frequency(str, nonDup.charAt(i));
            result+=""+nonDup.charAt(i)+count;
        }
        return result;
    }
}