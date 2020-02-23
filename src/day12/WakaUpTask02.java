package day12;

public class WakaUpTask02 {
    public static void main(String[] args) {
        String weather = "Rainy";
        if (weather.equals("Rainy")){
            System.out.println("Code in Rainy weather");
        }else if (weather.equals("Sunny")){
            System.out.println("Code in Sunny weather");
        }else if (weather.equals("Cloudy")){
            System.out.println("Code in Cloudy weather");
        }else if (weather.equals("Snowy")) {
            System.out.println("Code in Snowy weather");
        }else{
            System.out.println("CODE ANYWAY");
        }
    }
}
