package Cybertek.day35;

public class CharacterPractice {

    public static void main(String[] args) {
        // Character class has lots of methods
        // to perform actions on char value

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the number out of this String
        // and store it into Integer variable x:

        String numsInStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            //System.out.println(str.charAt(i));
            if (Character.isDigit(str.charAt(i))){
                System.out.println("str.charAt("+i+") = " + str.charAt(i));
                numsInStr+=str.charAt(i);
            }
        }
        System.out.println(numsInStr);
        Integer num = Integer.valueOf(numsInStr);
        System.out.println(num);

        }
}
