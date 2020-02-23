package day03;
public class PrimitivesPractice {
    public static void main(String[] args) {
        byte letterCount = 26;
        System.out.println("The letter count is = " +letterCount);
        short sheepCount = 300 ;
        System.out.println("The Sheep Count is = " +sheepCount);
        int catCount = 20;
        System.out.println("The Cat's Count = " + catCount);
        long mileToMoon = 5000000l;
        System.out.println("There " + mileToMoon + " Miles to the Moon");
        long mileToSun = 10000000L;
        System.out.println("There are " + mileToSun + " Miles to the Sun");
        // floating point
        //  f(F) must add at  the end of number to indicate this is float data type
        // upper or lower case don't matter BUT mandatory
        float priceOfBanana = 1.99f;
        System.out.println("The price of Banana is =" + priceOfBanana);
        float priceOfPotato = 2.49f;
        System.out.println("The price of Potato is = " + priceOfPotato);
        //larger floating point number
        double priceOfIpad1 = 355.95d;
        System.out.println("The price of an IPad 1 is = " + priceOfIpad1);
        double priceOdIpadPro = 1024D;
        System.out.println("The price of an IPad Pro is =" + priceOdIpadPro);
        double priceOfMac = 2299.99d;
        System.out.println("the price of the Mac is = " + priceOfMac);
        // If you a whole number by itself, compiler automatically assumes its an int
        // If you have a fractional number by itself, compiler automatically assumes it's as double

        int i = 100;
        int j = 3;
        int division = i/j;
        int multip = i*j;
        int r = 100%9;
        System.out.println(r);
    }
}