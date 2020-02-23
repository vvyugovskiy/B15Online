package day41;

public class Product {

    // this keyword can be used to refer the current object
    // we are working on
    // we can use it to refer the instance field
    //this.fieldName
    // only can be used inside instance method (and later constructor)

    private String name;
    private double price;

    public String getName() {
        return this.name;
        // return name ;
    }

    public void setName(String newName) {
        // name = newName;
        this.name = name;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double newPrice) {
//        if (newPrice > 0) {
//            price = newPrice;
//        }
//    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
