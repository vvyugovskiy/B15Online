package office_hours.Practice_2020_02_04;

public abstract class Device implements WaterProof {
 /*
    Pollymorphisim -->
    Samsung(child class) --> a device(super class) --> WaterProof(Interface)
     */

    int size;
    int price;

    public void call() {
        System.out.println("Calling with device ... ");
    }

    //abstract method

    public abstract void sendMessage();


}
