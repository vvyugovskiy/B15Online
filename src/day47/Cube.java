package day47;


public class Cube extends Shape {

    int length;

    public Cube (String name, int length){
        super(name);
        this.length = length;
    }

    public void calculateArea (){

        area = Math.pow(length,3);
    }

    @Override
    public String toString() {
        return "{"+ name +
                ", length='" + length + '\'' +
                ", area=" + area +
                '}';
    }
}
