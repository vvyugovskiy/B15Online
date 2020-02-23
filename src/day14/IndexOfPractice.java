package day14;

public class IndexOfPractice {
    public static void main(String[] args) {


        // indexOf --> find out index of another String inside This String
        String name = "Game Of Java";
        /*
        find out the location of Java
        find out the location of letter o
        find out the location of first space
         */
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("O"));
        System.out.println(name.indexOf(" "));

        if (name.indexOf("Kawa")>-1){


        System.out.println("KAWA Found");
        }else {
            System.out.println("No KAWA today");
        }
    }
}
