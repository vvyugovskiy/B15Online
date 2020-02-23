package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;

        Integer xObj1 = new Integer (12);

        Integer xObj2 = Integer.valueOf (10);
        Integer xObj3 = Integer.valueOf ("10");

        byte bValue = xObj2.byteValue();
        System.out.println("byte Value = "+bValue);
        double dValue = xObj2.doubleValue();
        System.out.println("double Value = " + dValue);

    }
}
