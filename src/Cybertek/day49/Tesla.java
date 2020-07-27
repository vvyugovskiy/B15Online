package Cybertek.day49;

public class Tesla  extends Vehicle implements Autonomous, Chargable{

    int horsePower ;
    String model;

    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is a self-drivable");
    }

    @Override
    public void start() {
        System.out.println("Just push a button to start");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "model=" + model +
                ", horsePower='" + horsePower + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void charge() {
        System.out.println("Is it time to charge?");
    }
}
