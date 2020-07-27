package Cybertek.day52.polimorphism;

public class Square extends Shape {

//    String name ;
//    double area ;
    int length ;

    public Square(String name, int length){
        super(name);   // reusing a functionality of a super class
        this.length = length;
    }
    @Override
    public  void calculateArea() {
        area = length * length;
    }

    @Override
    public void draw() {

        System.out.println("Draw 4 equal line with length " + length + " with " + COLOR + " color" );
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

