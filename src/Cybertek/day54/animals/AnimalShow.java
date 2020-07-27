package Cybertek.day54.animals;

public class AnimalShow {

    public static void main(String[] args) {
// Dog IS-A Dog
// Dog IS-A Animal
// Dog IS-A Object
// Dog IS-A IndoorPet

        Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.speak();
        d1.play();
        // refer a dog object as a Animal==>>only Speak method in this case
        Animal a1 = d1;
        a1.speak();
        // refer a dog object as a Object
        // can do Objects methods, like toString, hashCode....
        Object o1 = d1;
        // refer a dog object as a IndoorPet
        // it can only play
        IndoorPet p1 = d1;

    }
}
