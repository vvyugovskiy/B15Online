package day10;

public class MultiBranch_Practice_WithSwitch {
    public static void main(String[] args) {
        // McDonalds drivethru
        System.out.println("Welcome to McDonald, what can i get you");
        /*
        11 Burger
        5 French Fry
        8 Nuggets
        35 Ice Cream
        55 Coke
         */
        String order = "";
        int itemNumber = 11;
        // what data type of var. can i use
        // byte, short, int, char, String
        switch (itemNumber) {
            case 11:
            System.out.println("You have selected 11");
            order = "Burger";
            break;
            case 5:
            System.out.println("You have selected 5");
            order = "French Fry";
            break;
            case 8:
            System.out.println("You have selected 8");
        order = "Nuggets";
        break;
            case 35:
            System.out.println("You have selected 35");
            System.out.println("YAY!!!YAM!!!");
            order = "Ice Cream";
            break;
            case 55:
            System.out.println("You have selected 55");
            order = "Coke";
            default:
            System.out.println("Unknown ITEM");
}
        System.out.println("You ordered the "+order);
    }
}
