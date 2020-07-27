package Cybertek.day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like Pumpkin";
        System.out.println("str = " + str);

        System.out.println("Does it contain Pumpkin : ");
        System.out.println(str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith , endsWith
        // check if String starts with another String
        // check if a String ends with another String
        // and return true or false result

        boolean startedWuthI = str.startsWith("I");
        System.out.println("started Wuth I = " + startedWuthI);

        boolean endsWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("ends With Pumpkin = " + endsWithPumpkin);

        // password validator
        // minimum corrector
        // max corrector
        // must contain _ OR $
        // must not contain space
        // must start with Ab

        // if any of above condition does not match say INVALID PASSWORD
        // ELSE say GOOD PASSWORD

        String pass = "AbH2723gfgdsu$";
        // min is 8, max is 16
        boolean mainMax = pass.length() >= 8 && pass.length() <= 16;
        boolean must_$ = pass.contains("$") || pass.contains("_");
        boolean noSpace = !pass.contains(" ");
        boolean startsAb = pass.startsWith("Ab");


        if (mainMax && must_$ && noSpace && startsAb) {
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
        }

    }
}


