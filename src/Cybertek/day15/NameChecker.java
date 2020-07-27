package Cybertek.day15;

public class NameChecker {
    public static void main(String[] args) {

        String name = "Vladislav";
        System.out.println(name.length());
        if (name.length() < 4) {
            System.out.println("Short Name");
        } else if (name.length() >= 4 && name.length() <= 11) {
            System.out.println("Midium name");
        } else {
            System.out.println("Long name");
        }
        boolean n1;
        if (name.contains("a") || name.contains("e")) {
            System.out.println("Name has A or E");
        } else {
            System.out.println("There are no A or E in my name");
        }
    }
}
