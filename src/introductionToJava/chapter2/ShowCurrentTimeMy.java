package introductionToJava.chapter2;

public class ShowCurrentTimeMy {
    public static void main(String[] args) {

        long totalSeconds = (System.currentTimeMillis() / 1000);
        long currentSecond = totalSeconds % 60;
        //System.out.println(currentSecond);
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        //System.out.println(currentMinutes);
        long currentHours = totalMinutes / 60 % 24;
        // System.out.println(currentHours);
        System.out.println("Current Time : " + currentHours + ":" + currentMinutes + ":" + currentSecond+" GMT");
    }
}