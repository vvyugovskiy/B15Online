package Cybertek.day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        // find index of every a in case insensitive manner
        // i will go through each letter of the String --> for loop
        //        -->> each character i can use substring(0,1) and so on
        //        -->> going from 0 to last index -->> for loop
        // while i am going through each character
        // i will check whether current character i am looking at
        // equals to a or A       --->> currentCharacter.equalIgnoreCase("a")
        // if it is i will print the index -->> printLn (the variable used to keep the index)
        // if not    -->>  move on
        //perform this action until i reach last character
        // if i go over last character index i stop

        String myName = "Vladislav Vyugovskiy";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastNameIndex = charCount - 1;
        System.out.println("lastNameIndex = " + lastNameIndex);

        System.out.println("-----1 char------");
        // fot (int x=0; x<charCount; x++) {
        for (int i = 0; i < lastNameIndex; i++) {

            String currentChar = myName.substring(i, i + 2);
            // System.out.println(myName.substring(i, i + 1) + "->");
            if (currentChar.equalsIgnoreCase("la")) {
                // System.out.println("The index of aA : "+i);
                System.out.println("The index of la : "+i);
            }
        }

    }
}
