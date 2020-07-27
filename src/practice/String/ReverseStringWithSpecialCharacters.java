package practice.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWithSpecialCharacters {

    public static void main(String[] args) throws IOException {

        System.out.println(reverse("Hello<@#$>My, Friends<%^&>,And <*()> World!"));
//        reverseKeepSpaces("I Am Not String");
//        reverseKeepSpaces("1 22 333 4444 55555");
//--------------------------------------------------------------------------------------------------------------------
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder sb = new StringBuilder(s);

        String revS = new StringBuilder(s.replaceAll(" ", "")).reverse().toString();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) != ' ')
            {
                sb.setCharAt(i, revS.charAt(c));
                c++;
            }
        }

        System.out.println(sb);
    }
//--------------------------------------------------------------------------------------------------------------------
    public static String reverse (String sentence){

        char[] arr = sentence.toCharArray();
        for (int i=0,j=arr.length-1; i<j; i++,j--){
            while(!Character.isLetterOrDigit(arr[i])){
                i++;
            }
            while (!Character.isLetterOrDigit(arr[j])){
                j--;
            }
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return new String (arr);
    }

    public static void reverseKeepSpaces (String s){

        char [] arr1 = s.toCharArray();
        char[] resultArr = new char[arr1.length];
        //First for loop :
        //For every space in the 'inputStringArray',
        //we insert spaces in the 'resultArray' at the corresponding positions
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==' '){
                resultArr[i]=' ';
            }
        }
        int j = resultArr.length-1;
        //Second for loop :
        //we copy every non-space character of inputStringArray
        //from first to last at 'j' position of resultArray
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=' '){
                if (resultArr[j]==' '){
                    j--;
                }
                resultArr[j]=arr1[i];
                j--;
            }
        }
        System.out.println(String.valueOf(resultArr));
    }

}
