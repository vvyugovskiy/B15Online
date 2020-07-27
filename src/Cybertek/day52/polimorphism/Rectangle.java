package Cybertek.day52.polimorphism;

public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(String name,int width,int height) {

        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
