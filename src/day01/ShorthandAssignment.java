package day01;

public class ShorthandAssignment {

    public static void main(String[] args) {

        int guests = 3;
        guests = guests + 2;
        System.out.println(guests);

        guests += 3;
        System.out.println(guests);

        guests -= 4;
        System.out.println(guests);

        int apples = 3;

        apples *= 2;
        // same as apples = apples *2;
        System.out.println(apples);

        int minutes = 315;
        int hours = minutes / 60;
        System.out.println(hours);

        // minutes = minutes % 60;
        minutes %= 60;
        System.out.println(minutes);

        boolean sweet = false;
        boolean hot = (sweet = true);
        System.out.println(sweet);
        System.out.println(hot);




    }
}
