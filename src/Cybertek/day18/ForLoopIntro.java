package Cybertek.day18;

public class ForLoopIntro {
    public static void main(String[] args) {


        // count fr0m 1-5

        // for loop () has 3 parts separated by ;
        // first part initialization :
                // it will run only once when you enter the loop
        // second part Termination condition :
                //loop will stop if it's false
                // it will be checked every time
        //third part increment or decrement to change condition every
        // it will run after every iteration
        for (int i = 1; i <= 5; ++i) {
            System.out.println("i = : "+i);
            System.out.println("Happy Birthday");
        }
        for (int y = 5; y >= 1; --y) {
            System.out.println("i = : " + y);
        }
    }
}
