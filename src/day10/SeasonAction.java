package day10;

public class SeasonAction {
    public static void main(String[] args) {

        String season = "Fall";
        switch (season){
            case "Spring":
                System.out.println("Hike, Easter, Blossom...");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Easter, Birthday. Halloween...");
                break;
            case "Winter":
                System.out.println("Ski, New Year, Christmas...");
                break;
            default:
                System.out.println("Have fun anyway");
        }
        System.out.println(season);
    }
}
