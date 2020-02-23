package day44;

public class Train extends Vehicle {

    int wagonCount;

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.makeChoChoSound();
        // this attributes we got from Vehicle
        t1.make = "Thomas";
        // t1.year = 1999; -->> private is not inherited
        t1.setYear(1999) ;
        System.out.println(t1.getYear());
        // calling ge method we got in Vehicle
        t1.start();
        t1.goForvard();
    }

    public void makeChoChoSound() {
        System.out.println("CHOOOO CHOOOO");
    }

}
