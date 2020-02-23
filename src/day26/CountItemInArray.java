package day26;

import java.util.Arrays;

public class CountItemInArray {
    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};


        System.out.println("marvel Heroes = " + Arrays.toString(marvelHeroes));
        String itemToSearch;
        int count = 0;
        System.out.println(marvelHeroes.length);
        itemToSearch = "Black";
        for (String eachHero : marvelHeroes) {
           // if (eachHero.equals(itemToSearch)){
            if (eachHero.toLowerCase().contains("black")){
                // System.out.println("found");
                count++;
            }
        }
        System.out.println(count);
    }
}
