package Cybertek.day45;

public class Phone extends Electronic {

    // Sub class inherit every VISIBLE instance field static field
    //String brand;
    // static boolean useElectricity = true;
    double size;
    double prize;

    public static void main(String[] args) {


        Phone p1 = new Phone();
        p1.size = 12;
        p1.prize = 399;
        p1.brand = "Apple";
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of same class in static method
        System.out.println(useElectricity);
        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayUseElectricity();
        // static way
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();
    }
}
