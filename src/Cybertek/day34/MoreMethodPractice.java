package Cybertek.day34;


public class MoreMethodPractice {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));

        System.out.println(monkeyTrouble2(true, true));
        System.out.println(monkeyTrouble2(false, false));
        System.out.println(monkeyTrouble2(true, false));
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //TODO : Your code goes here
        // 1ST WAY
//        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
//            return true;
//
//        }else{
//            return false;
//        }
        // 2ND WAY
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public static String monkeyTrouble2(boolean aSmile, boolean bSmile) {
        //TODO : Your code goes here
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}


