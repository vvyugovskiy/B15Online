package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        /* McDonal's drivethrow
        11 Burger
        5 French Fry
        8 Nuggets
        35 Ice Cream
        55 Coke
         */
        System.out.println("Welcome to McDonald, what can i get you");
        String order = "";
        int itemNumber = 4;

        if(itemNumber==11){
            System.out.println("You have selected 11");
            order = "Burger";
        }else if (itemNumber==5){
            System.out.println("You have selected 5");
            order = "French Fry";
        }else if (itemNumber==8){
            System.out.println("You have selected 8");
        order = "Nuggets";
    }else if (itemNumber==35){
            System.out.println("You have selected 35");
            order = "Ice Cream";
        }else if (itemNumber==35) {
            System.out.println("You have selected 35");
            System.out.println("YAY!!!YAM!!!");
            order = "Coke";
        }else {
            System.out.println("Unknown ITEM");
}

    }
}
