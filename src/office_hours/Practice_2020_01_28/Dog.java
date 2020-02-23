package office_hours.Practice_2020_01_28;

public class Dog extends Animal {

    //Dig is an animal

    String dogName;

    @Override
    public void run() {
        System.out.println("The dog is running ");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleepng ");
    }
}