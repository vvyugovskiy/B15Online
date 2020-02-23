package day22;

public class StringArray {
    // create a String Array with size of name of yur household member

    public static void main(String[] args) {
        String [] home = {"Ekaterina","Michael","Alexander","Tamara"};
        for (int x = 0; x <= 3; x++) {
            System.out.println(home[x]);
        }
        // immutable means you can not chanhe the internal structure of the object
        // if you have String abc = "Hello"
        // if you do .toUpperCase it WILL create a new one "HELLO"
        // SO it does not change the original one at all!!!

        // not resizable --> specifically for array
        //

    }
}
