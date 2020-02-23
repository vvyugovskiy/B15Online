package practice;

public class Variables {

    public static void main(String[] args) {
        System.out.println(average(45, 55, 7, 8, 6, 9, 4)); // will give you average è19
    }

    public static int average(int... numbers) {
        int total = 0;
        for (int each : numbers)
            total += each;
        return total / numbers.length;
    }
}

