package Cybertek.day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitives

        /*

        block comment

        is String a primitive? NOOOOO
        String is a siquense of characters

         */

        int birthYear = 1986;
        int currentYear = 2019;
        int age = currentYear - birthYear;

        System.out.println("I was born in year " + birthYear + ", and i am " + age + " years old");

        /*
           task 2: you are speeding today
            speed limit is some number? and current speed is this
            generate the output of:  You are driving 10 MPH over a speed limit
                 speed limit is int ? current speed is intover theLimit as int
         */

        int speedLimit = 75;
        int overTheLimit = 10;
        int currentSpeed = speedLimit+overTheLimit;

        System.out.println("You are drivind with "+currentSpeed+ " MPH");

        int speedLimit1 = 75;
        int currentSpeed1 = 92;
        int overTheLimit1 = currentSpeed1-speedLimit1;

        System.out.println("You are drivind with speed of "+currentSpeed1+ " MPH, which is "+overTheLimit1+" MPH more than speed limit");




    }
}
