package Cybertek.day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     */
    public void displayInformation() {
        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);
    }

    // write a method called turnToFullTime
    public void turnToFullAction() {

        if (!isFullTime) {
            isFullTime = true;
        } else {
            System.out.println("Already FULLTIME");
        }
    }
    // write a method to change the location of the offer
    // to the location user passed

    public void changeLocation(String newLocation) {

        location = newLocation;

    }

    // write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime) {
        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newIsFullTime;
        // an instance method can cal  another method
        // ann instance method can use any instance field
        displayInformation();
    }

    public boolean is100KOffer() {

        return salary >= 100000;
    }
    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @return String representation of Offer Object
     * In below format
     * [Location = Virginia, Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */
    public String toString() {
        String result = "[Location = " + location + ", Company = " + company + " | Salary = " + salary + " $ | isFullTime = " + isFullTime + "]";
        return result;
    }
}
