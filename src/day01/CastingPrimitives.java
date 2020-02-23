package day01;

public class CastingPrimitives {
    public static void main(String[] args) {


        // int i = 3.9; can not compile
        //  int i = (int) 3.0;
        int i = (int) 3.9;
        System.out.println(i);

        // Implicit casting
        double d1 = 200;
        long l = i;
        System.out.println(d1);


        //Explicit Casting

        byte b1 = 5;
        short sh1 = 400;
        b1 = (byte) sh1;
        double price = 200.55;
        int iPrice = (int)price;
        System.out.println(iPrice);

        // int int1 = 5/2.0; would not work because of division with double will be double

        int int1 = (int)(5/2.0);

        String str = "10";
        // int n1 = (int) str; CAN NOT cast String















    }
}
