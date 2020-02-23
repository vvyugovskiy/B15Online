package day14;

public class LastIndexOf {
    public static void main(String[] args) {

        String name = "Game of Java";
        // find out last location the letter a shows up
        System.out.println(name.lastIndexOf("a"));

        //find out last location the " " a shows up
        System.out.println(name.lastIndexOf(" "));

        //find out last location the Ga shows up
        System.out.println(name.lastIndexOf("Ga"));

        //find out last location of Kawa
        System.out.println(name.lastIndexOf("Kawa"));

    }
}
