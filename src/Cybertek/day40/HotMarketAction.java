package Cybertek.day40;

import java.util.ArrayList;

public class HotMarketAction {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.company = "Google";
        o2.location = "Boston";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer o4 = new Offer();
        // if we don't assign values for instance filed\ variable
        // we get default values
        // fro primitives : 0 or 0.0
        // boolean : false
        // char : ''
        // for any reference type :
        // null
        o4.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        System.out.println("myOffers : ------------------------------------------ ");
        for (Offer each: myOffers) {
            each.displayInformation();
        }
    }
}
