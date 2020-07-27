package Cybertek.day48;

public class Kangaroo implements Bouncible, BoxerWithBellyPouch{

    String name;
    int jumpInDistance;

    public Kangaroo(String name, int jumpInDistance) {
        this.name = name;
        this.jumpInDistance = jumpInDistance;
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name "+name+ " is kickboxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo " + name+ " carrying a child "+ jumpInDistance + " feet far");
    }

    @Override
    public void bounce() {
        System.out.println("Kangaroo " +name+ " is bouncing" +jumpInDistance + " far");
    }



    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpInDistance=" + jumpInDistance +
                '}';
    }

    public void eat(){
        System.out.println("Kangaroo "+name+" eats all the time");
    }


}
