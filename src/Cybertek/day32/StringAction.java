package Cybertek.day32;

public class StringAction {
    public static void main(String[] args) {

        reversePrintMyOwnName();
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tokun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");
    }
    // reversePrintMyOwnName
    // create a method that has no parameter
    // and print your name in reversed order
    public static void reversePrintMyOwnName() {

        String myName = "Vladislav";
        for (int i = myName.length() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myName.charAt(i) + "-");
            } else {
                System.out.print(myName.charAt(i));
            }
        }
        System.out.println();
    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar -->> A-k-b-a-r
    // logic : keep concatenating - after each character
    // when it comes to last character don't add it

    public static void printStringWithDashInBetween(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            //if im not at last index then i Print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
