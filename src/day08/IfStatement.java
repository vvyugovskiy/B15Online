package day08;

public class IfStatement {
    public static void main(String[] args) {

        int speedLimit = 60;
        int youCurrentSpeed = 145;

        /*
        if yourCurrentSpeed > than speedLimit
        get pulled over
        given ticket by the police
        taken away some points on your license
        go to court

        if not go shopping
         */

        boolean amISpeeding = (youCurrentSpeed > speedLimit) ;

        // inside perenthesis we can only pun boolean
        // boolean value
        // boolean variable
        // any expression that return boolean value : true or false

        // if (amISpeeding) {
        // if (true or false) {
        if (youCurrentSpeed > speedLimit) {
            System.out.println("You are in troubles");
            System.out.println("You get arrested");
            System.out.println("You loose money");
            System.out.println("You get fined");
        }else{
            System.out.println("Go shopping!!");
            System.out.println("Buy some Ice Cream");


        }

        /*
        outside the statement, say the end
         */
        System.out.println("The End");
    }
}
