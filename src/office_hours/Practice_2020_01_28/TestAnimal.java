package office_hours.Practice_2020_01_28;

public class TestAnimal {

    public static void main(String[] args) {

        // create object
        // Animal animal1 = new Animal();

        Dog dog = new Dog();
        dog.eat();
        dog.call(); // The animal is calling
        dog.run(); // The dog is running

        System.out.println("================");

        Cat cat = new Cat();
        cat.eat();
        cat.call();
        cat.run(); // the cat is running
        cat.sleep();

    }
}
