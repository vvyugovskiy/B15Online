package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        // each character has it's corresponding ascii value

        // int x = 'A';
        // System.out.println(x);

        char myChar = 'A'; // e
        System.out.println(myChar);
        // 'A' = 1-->>65 +1 = 66 -->> -->> 'B' (myChar data type is char)
        System.out.println(++myChar);
        // 'B' = 1-->>66 +1 = 67 -->> -->> 'C' (myChar data type is char)
        System.out.println(++myChar);
        // 'C' = 1-->>67 +1 = 68 -->> -->> 'D' (myChar data type is char)
        System.out.println(++myChar);
        // 'D' = 1-->>68 +1 = 69 -->> -->> 'E' (myChar data type is char)
        System.out.println(++myChar);
        System.out.println('A'>'B'); // 65>66
        System.out.println('Z'>'B');
        for (char iChar = 'A'; iChar <='Z'; iChar++){
            System.out.print(iChar+", ");
        }
        System.out.println();
        for (char kChar = 'Z'; kChar >= 'A'; kChar--) {
            System.out.print(kChar+", ");

        }
        // HOME WORK
        // Ask user starting and ending Character
        // then print everything in between
        //it Could me starting character is after ending Character
        // For EX. User enter Z A, or A K
        // Can we ask user a Character? NO!!!
        // Ask user for Stringand pick first character by charAt(0)
    }
}
