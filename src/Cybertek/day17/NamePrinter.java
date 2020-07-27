package Cybertek.day17;

public class NamePrinter {
    public static void main(String[] args) {

        String name = "Alexander";  // call 1-800-Alexander
        // get each corrector printed vertically

        int x = 0;
        // in order to print each character of a String
        // w eneed to start getting character
        //from index 0 till last index (name.length ()-1)
        while (x<name.length()) {
            System.out.print("index "+x+" : ");
            System.out.println(name.charAt(x));
            ++x;
        }
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(8));


    }
}
