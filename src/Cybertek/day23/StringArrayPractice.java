package Cybertek.day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        //created an array in a short way just by opening {}

        String[] shows = {"Orville", "Gifted", "Game of Trones", "Flash", "Arrow", "Super Girl"};
        int showsCount = shows.length;
        System.out.println("Shows count : "+showsCount);
        for (int x = 0; x < showsCount; x++) {
            // String favorite = "Orville";
            // want to find a characters count for each show
            System.out.println(shows[x] + " show has : " + shows[x].length() + " : characters count");
            //System.out.println();
        }
    }
}
