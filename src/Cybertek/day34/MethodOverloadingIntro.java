package Cybertek.day34;

public class MethodOverloadingIntro {

    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);
        // 01234567890
        String name = ("overloading");
        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));
        // two versions of indexOF method (there are 4)
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2));

        // Arrays.toString has 9 different versions to accept different parameter

        //Method overloading:
        //
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello();
        System.out.println(sayHello("Muge","Orman"));
    }

    public static void sayHello() {
        System.out.println("Hello, World");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int name) {
        System.out.println("Hello, " + name);
    }
    // public static String sayHello() {
    // public static void sayHello(int x) {

    public static String sayHello(String firstName, String lastName) {

        return "Hello " + firstName +" "+ lastName;
    }
}