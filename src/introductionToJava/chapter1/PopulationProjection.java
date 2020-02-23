package introductionToJava.chapter1;

public class PopulationProjection {
    public static void main(String[] args) {

        // 1 birth per 7 seconds
        // one death per 13 seconds
        // one new immigrant every 45 seconds
        int currentPopulation = 312032486;

        double secondsYear = 365.0 * 24 * 60 * 60;
        //System.out.println(secondsYear);
        double birthsYear = secondsYear/7;
        System.out.println("Births per Year :"+birthsYear);
        double deathsYear = secondsYear/13;
        System.out.println("Deaths per Year :"+deathsYear);
        double immigrantsYear = secondsYear/45;
        System.out.println("Immigrants per Year :"+immigrantsYear);
        double populationProjectionin5Years = (int)(birthsYear+immigrantsYear-deathsYear)*5+currentPopulation;
        System.out.println("Population Projection = " + populationProjectionin5Years);

    }
}
