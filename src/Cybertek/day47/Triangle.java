package Cybertek.day47;

public class Triangle extends Shape{


    int height, base;

    public Triangle(String name, int height, int base ) {
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea (){
        area = height*base/2;
    }

    @Override
    public String toString() {
        return "{" + name +
                ", base=" + base +
                ", height='" + height + '\'' +
                ", area=" + area +
                '}';
    }


}
