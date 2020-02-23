package day39;

public class Garage2 {
    public static void main(String[] args) {

        // Create car object using Class
        // or
        // Get an instance of Car class

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "535XI";
        car1.color = "White";
        car1.licenceState = "SC";
        car1.millage = 45000;
        car1.yearProduced = 2016;
        car1.goForward();
        car1.printAge();
        car1.changeColorTo("Blue");
        System.out.println("car1.color = " + car1.color);
        System.out.println("++++++++++++++++++++++++++");

        Car car2 = new Car();
        car2.yearProduced = 2017;
        car2.brand = "Hyunday";
        car2.model = "SantaFe";
        car2.color = "Black";
        car2.goForward();
        car2.printAge();
        System.out.println("END");



    }
}
