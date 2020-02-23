package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {

        Pet p1 = new Pet();
        System.out.println("p1 = " + p1);
        p1.speaks();
        p1.setType("cow");
        p1.speaks();
        System.out.println("-------------------------");
        Pet p2 = new Pet("horse", "Walter");
        Pet p3 = new Pet("cat", "Samantha");
        Pet p4 = new Pet("dog", "Oliver");
        Pet p5 = new Pet("dog", "Henry");
        Pet p6 = new Pet("cow", "Adam");
        Pet p7 = new Pet("ant", "Atom");
        Pet p8 = new Pet("bear", "Teddy");
        Pet p9 = new Pet("cat", "Stephanie");

        List<Pet> myPet = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
        System.out.println("My Pet = " + myPet);

        for (Pet each : myPet) {
            System.out.println("Each pet name : " + each.getName());
        }
        System.out.println("----------------------");
        for (Pet each :myPet) {
            if (each.getType().equals("cat")){
                System.out.println("each cat = " + each.getName());
            }
        }
    }
}
