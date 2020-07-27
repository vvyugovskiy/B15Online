package Cybertek.day13;

public class WarmUp_Amazon_Nested {
    public static void main(String[] args) {

        // create a boolean
        // store a result of doYouWanToShop
        // if yes, do you want to go to Store or just to shop online?
        // if not --> Stay home and CODE

        boolean youWantToShop = true;
        String preference = "Online";

        if (youWantToShop == true) {

            if (preference.equalsIgnoreCase("Store")) {
                System.out.println("Going to Costco");
            } else {
                System.out.println("Let's Browse the eBay ");
            }

        } else {
            System.out.println("Stay Home and CODE");
        }
    }

}