package Cybertek.day51.polymorhism;

public class Animal {

    public void makeNoise (){
        System.out.println("General Animal Noise");
    }

}

// i can add more classes as long as only one class is public and name is same as file name

class Dog extends Animal{

    @Override
    public void makeNoise (){
        System.out.println("Woof!");
    }

}

class Horse extends Animal{

    @Override
    public void makeNoise (){
        System.out.println("Neinei!");
    }
}