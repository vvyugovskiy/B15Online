package Cybertek.day21;

public class SearchingSomethingInStrin3 {
    public static void main(String[] args) {

        String myName = "Vladislav Vyugovskiy";
        int count = 0;
        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastNameIndex = charCount - 1;
        System.out.println("lastNameIndex = " + lastNameIndex);
        System.out.println("-----3 char------");
        // fot (int x=0; x<charCount; x++) {
        for (int i = 0; i < myName.length() - 1; i++) {

            String currentChar = myName.substring(i, i + 1);
            // System.out.println(myName.substring(i, i + 1) + "->");
            if (currentChar.equalsIgnoreCase("v")) {
                System.out.println("The index of lav : " + i);
                count++;
            }
        }
        System.out.println(count);
    }
}
