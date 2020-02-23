package practice.OCA.t3;

class TestX {
    public static int stVar = 100;
    public int var = 200;

    public String toString() {
        return var + " : " + stVar;
    }
}
public class ClassX {

    public static void main(String[] args) {

        TestX t1 = new TestX();
        t1.var = 300;
        System.out.println(t1);
        TestX t2 = new TestX();
        t2.stVar = 300;
        System.out.println(t2);

    }
}
