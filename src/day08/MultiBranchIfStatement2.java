package day08;

public class MultiBranchIfStatement2 {
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
        int currentSpeed = 90;
        // int speedLimit = 60;
        if (currentSpeed >= 90) {
            System.out.println("you are driving more than 90 - Go To JAIL!!!");
            // asking whether it's ;ess than or equal 70 and more than 60
        } else if (currentSpeed > 80) {
            System.out.println("you are driving more than 80 - Reckless driving!!");
        }else if (currentSpeed >70){
            System.out.println("you are driving more than 70 - POINTS TAKEN!!!");
        }else if (currentSpeed >60 ){
            System.out.println("you are driving more than 60 - WARNING GIVEN!!!");
        }else{
            System.out.println("KEEP DRIVING SAFELY");
        }
    }
}