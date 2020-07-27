package Cybertek.day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals{

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class yiu create CAN be a data type for a variable
        // also known as reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

        List<Integer> lst = new ArrayList<>();



    }
    @Override
    public void drinkMilk(){
        System.out.println("Lion drinks milk");
    }

    @Override
    public void makeNoise (){
        System.out.println("RRRRRRRRRRRRRRRRRRRRRR");
    }
}
