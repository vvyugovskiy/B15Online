package day39;

public class Garage {
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

        Car car2 = new Car();
        car2.yearProduced = 2017;
        car2.brand = "Hyunday";
        car2.model = "SantaFe";
        car2.color = "Black";
        car2.goForward();
        System.out.println("car2.make = "+car2.model);

        car2.color = car1.color;

        System.out.println("car2.color = "+car2.color);

        car2.yearProduced = 2020;
        System.out.println("car2.yearProduced = " + car2.yearProduced);
        car2.color = car1.color;

    }
}
