package day21;

public class NameBreaker {
    public static void main(String[] args) {

            //         01234567890123456789
        String name = "Vladislav Vyugovskiy";

// GET OUT from the loop when you see letter "l"

        for (int x = 0; x < name.length(); x++) {

            char currentChar = name.charAt(x);


            if (currentChar == 'l' || currentChar == 'L') {
                System.out.println("FOUND IT !!!!!");
                break;
            }

            System.out.println(currentChar);
        }
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
// GET OUT from the loop when you see letter "s"
        for (int x = 0; x < name.length(); x++) {
            String CurrentChar = name.substring(x, x + 1);

            if (CurrentChar.equalsIgnoreCase("s")) {
                System.out.println("FOUND IT!!!");
                break;
            }
            System.out.println(CurrentChar);
        }
//_____________________________________________________________________________________________
// OPTIONALLY CHAIN THE METHOD WITHOUT SAVING EACH CHAR
        for (int x = 0; x < name.length(); x++) {

            if (name.substring(x, x + 1).equalsIgnoreCase("s")) {
                System.out.println("FOUND IT!!!");
                break;
            }
            System.out.println(name.substring(x, x + 1));
        }
    }
}