package Cybertek.day44;

public class CyberHouse {

    // we can change default value of the fields
    // by assigning value directly in the template class
    private static String neighbourhoodName = "Cybertek Ave.";
    String design;
    int houseNum;

    // constructor can access anything
    public CyberHouse(String design, int houseNum) {
        this.houseNum = houseNum;
        this.design = design;
    }

    // INSTANCE METHOD CAN ACCESS ANYTHING
    public void showAllInfo() {
        System.out.print("House number " + this.houseNum + " has "
                + this.design + " design "
                + neighbourhoodName + " Neighbourhood Name ");
        System.out.println();
    }

    // STATIC METHOD CAN ONLY ACCESS STATIC MEMBERS OF SAME CLASS
    public static void showNeighborhood() {
        System.out.println("Neighbourhood : " + neighbourhoodName);
        // CAN NOT ACCESS ANYTHING NON_STATIC INSIDE STATIC METHOD
        // System.out.println("houseNum = " + houseNum);
    }

}
