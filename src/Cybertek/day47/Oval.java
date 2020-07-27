package Cybertek.day47;

public class Oval extends Shape{

    int longR;
    int shortR;

    public Oval (String name, int longR,int shortR){
        super(name);
        this.longR = longR;
        this.shortR = shortR;
    }

    public void calculateArea ()
    {
        area = Math.PI*longR*shortR;
    }

    @Override
    public String toString() {
        return "{" + name +
                ", shortR=" + shortR +
                ", longR='" + longR + '\'' +
                ", area=" + area +
                '}';
    }
}
