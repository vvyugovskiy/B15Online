package office_hours.Practice_2020_01_27;


class TestData {
    int a = 100;

    public TestData(int a) {
        System.out.println("A");
    }

    public void method1() {
        //  TestData obj = new TestData();
        System.out.println("super class instance method");
    }
}

public class Super_Keyword extends TestData {

    public Super_Keyword() {
//        super(); // A
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {
//        super.a = 300;
//        super.mathod1();
        // mm();

        Super_Keyword obj = new Super_Keyword();
        // obj.mm2();
    }

    public void method1() {
        System.out.println("sub class instance method");
    }

    public void mm() {
        System.out.println(super.a);  // calling instance variable from super
        super.method1();  // calling instance method from super
    }

    public void mm2() {
        System.out.println(super.a);  //calling instance variable from sub class
        this.method1();   //calling instance method from sub class
    }


}
