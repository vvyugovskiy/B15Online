package replit.$_201_250;
import java.util.ArrayList;
//  Given a string, that contains special character together with alphabets
//  (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters are not affected.
public class MethodsWithString16ReverseLetters_210 {
    public static void main(String[] args) {

        String result = reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true
        String result2 = reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true
        String result3 = reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
    }
    public static String reverseLetters(String word) {
        //TODO
        String result = "";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (Character.isLetter(word.charAt(i)))
                reverse += word.charAt(i);
        }
        for (int i = 0, x = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                result += word.charAt(i);
            } else {
                result += reverse.charAt(x);
                x++;
            }
        }
        return result;
//        String result ="";
//        ArrayList<String> temp= new ArrayList<>();
//        for(int i=word.length()-1; i>=0; i--) {
//            if (Character.isLetter(word.charAt(i)))
//                temp.add("" + word.charAt(i));
//        }
//        for (int i = 0 , k=0 ; i <word.length() ; i++) {
//            if(Character.isLetter(word.charAt(i))){
//                result+=temp.get(k);
//                k++;
//            }else {
//                result+=word.charAt(i);
//            }
//        }
//        return result;
//         Shorter way in 1 Shot
//         public static String reverseLetters(String word){
//           String output = "";
//           for (int i=0, k=word.length()-1; i<word.length(); i++) {
//                if (Character.isLetter(word.charAt(i))) {
//                    while (!Character.isLetter(word.charAt(k))) {
//                         k--;
//                    }
//                    output += word.charAt(k);
//                    k--;
//              } else {
//                    output += word.charAt(i);
//                }
//           }
//            return output;
//        }
    }
}