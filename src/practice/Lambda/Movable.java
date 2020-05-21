package practice.Lambda;

@FunctionalInterface
public interface Movable {

    void move(int mile);
}

@FunctionalInterface
interface Measurable {

    void measure();
}

@FunctionalInterface
interface Computable {

    void compute(int num1, int num2);
}

@FunctionalInterface
interface Flyable {

    boolean flyHigh (int mile);
}

//class DistantMover implements Movable {
//
//
//    @Override
//    public void move(int mile) {
//        System.out.println("Move " + mile);
//    }
//}
//
//class ShortDistantMover implements Movable {
//
//    @Override
//    public void move(int mile) {
//        System.out.println("moving short mile " + mile);
//    }
//}

