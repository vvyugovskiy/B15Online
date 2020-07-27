package Cybertek.day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";
        // how would you store each and every character
        // to a Char Array from above name
        // without using method we are about to learn
        char [] nameChars = new char [name.length()];
//        nameChars [0]= name.charAt(0);
//        nameChars [1]= name.charAt(1);
//        nameChars [2]= name.charAt(2);
//        nameChars [3]= name.charAt(3);
//        nameChars [4]= name.charAt(4);
//        nameChars [5]= name.charAt(5);

        for (int x = 0; x < nameChars.length; x++) {
            // take each character of name and fill the char array values
            nameChars[x]=name.charAt(x);
        }
        Arrays.sort(nameChars);

        System.out.println("nameChars = "+ Arrays.toString((nameChars)));
        char[] namesChar2 = name.toCharArray();
        Arrays.sort(namesChar2);
        System.out.println("name Chars 2 = "+Arrays.toString(namesChar2));

        String myName = "Vladislav";
        char [] myNameChars = new char[myName.length()];
        for (int x = 0; x < myNameChars.length; x++) {
            myNameChars[x]=myName.charAt(x);
        }
        System.out.println("myNameChars = " + Arrays.toString(myNameChars));
        int count =0;
        for (char myNameCH : myNameChars) {
            System.out.print(myNameCH+", ");
            if (myNameCH=='a'){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        Arrays.sort(myNameChars);
        System.out.println(Arrays.toString(myNameChars));

    }
}
