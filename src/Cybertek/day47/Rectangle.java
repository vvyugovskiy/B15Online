package Cybertek.day47;

public class Rectangle extends Shape {

    int width, height;

    public Rectangle (String name, int height, int width){
        super(name);
        this.height = height;
        this.width = width;
    }
    public void calculateArea (){
        area = height*width;
    }

    @Override
    public String toString() {
        return "{" + name +
                ", height=" + height +
                ", width='" + width + '\'' +
                ", area=" + area +
                '}';
    }
}
