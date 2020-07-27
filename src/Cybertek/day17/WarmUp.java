package Cybertek.day17;

public class WarmUp {
    public static void main(String[] args) {


        // String to store the name in any case combinations
        // Create a var. called name2
        // make youe first letter uppercase then rest lowercase
        // optionaly use Scanner
        // substring if getting another String inside another String


        String name = "vlaDisLaV";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
       // int firstL = name.indexOf(0);
        System.out.println(name.toUpperCase().charAt(0)+name.toLowerCase().substring(1));
        System.out.println(name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1));

    }
}
