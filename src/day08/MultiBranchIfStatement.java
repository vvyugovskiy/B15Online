package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        //  pseudo \ sudo code
        /*
        given your currentSpeed, speedLimit,
        check if currentSpeed more
        than 90 --> jail
        than 80 and less than 90 --> reckless driving
        than 70 and less than 80 --> point taken
        than 60 and less than 70 --> warning

        if not speeding
        keep driving
         */
// try 45, 65, 90
        int currentSpeed = 45;
        // int speedLimit = 60;
        if (currentSpeed > 60) {
            System.out.println("you are driving more than 70 - POINTS TAKEN!!!");
            // asking whether it's ;ess than or equal 70 and more than 60
        } else if (currentSpeed > 70) {
            System.out.println("you are driving more than 60 - IT'S A WARNING!!");
        }else {
            System.out.println("You are withing a speed limit - DRIVE SAFELY");
        }
    }
}