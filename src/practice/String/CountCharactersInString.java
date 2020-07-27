package practice.String;

public class CountCharactersInString {

    public static void main(String[] args) {


//        System.out.println("Counter Characters :: "+ countCharacters(" Marge let a moody baby doom a telegram.", 'l'));
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        countAllCharacters(" Marge let a moody baby doom a telegram.");

    }

//    public static int countCharacters(String s, char ch) {
//
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ch) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static void countAllCharacters(String s) {

        String uniqueVerify = "";

        for (int i =0; i<s.length();i++){

            if(uniqueVerify.contains(s.charAt(i)+"")) continue;

            int count=0;

            for (int j=0; j<s.length();j++){

                if (s.charAt(i)==s.charAt(j)) count++;

            }
            System.out.println(s.charAt(i) + " - " + count );
            uniqueVerify+=s.charAt(i);
        }
    }
}