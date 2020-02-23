package introductionToJava.chapter1;

public class AverageSpeedInKm {
    public static void main(String[] args) {

        double averKmHour = (24*3600/ (60*60+60*40+35))*1.6;
        System.out.println("averKMHour = " + averKmHour);
    }
}
