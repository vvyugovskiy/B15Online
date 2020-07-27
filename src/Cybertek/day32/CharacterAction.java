package Cybertek.day32;

public class CharacterAction {

    public static void main(String[] args) {

        printAtoZ();
        printZtoA();
        printAlphabetInRange('a', 'z');
        printAlphabetInRange('G', 'B');
        printAlphabetInRange('A', 'A');
        printAlphabetInRange('a', 'A');
        printAlphabetInRange('Z', 'a');
    }
    /**
     * if beginning character is before ending character
     * for example beginning A , ending D  -->> ABCD
     * we did similar action with printing A-Z
     * <p>
     * if beginning character is after ending character
     * for example beginning D , ending A  -->> DCBA
     * we did similar action with printing Z-A
     */
    public static void printAlphabetInRange(char beginning, char ending) {
        //  this mean beginning character comes before ending character
        //  in ascii table
        if (beginning < ending) {
            System.out.println("WE NEED To Increment From " + beginning + " till " + ending);
            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();
            // this mean beginning character comes after ending character
            // in ascii table
        } else if (beginning > ending) {
            System.out.println("WE NEED To Decrement From " + beginning + " till " + ending);
            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();
        } else {
            System.out.println("They are THE SAME Characters");
        }
    }
    //    printAtoZ
    //    create a method that has no parameter
    //    and print A-Z in one line
    public static void printAtoZ() {
        // 'A'++  -->> 'B'
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");
        }
        System.out.println(); // so we can start with a new line
    }

    //    printZtoA
    //    create a method that has no parameter
    //    and print Z-A in one line
    public static void printZtoA() {
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println(); // so we can move to next line
    }
}
