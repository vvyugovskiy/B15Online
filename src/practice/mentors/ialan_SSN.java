package practice.mentors;

import com.sun.source.tree.LabeledStatementTree;

import java.awt.font.TextHitInfo;
import java.util.Scanner;

public class ialan_SSN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your SSN in a valid order");
        String ssn = input.next();

        boolean firstCondition = false;
        boolean secondCondition = false;
        boolean thirdCondition = false;
        String firstPart = "";
        String secondPart = "";
        String thirdPart = "";
        firstPart = ssn.substring(0, ssn.indexOf("-"));
        secondPart = ssn.substring(ssn.indexOf("-") + 1, ssn.lastIndexOf("-"));
        thirdPart = ssn.substring(ssn.lastIndexOf("-") + 1);
        System.out.println(firstPart);
        System.out.println(secondPart);
        System.out.println(thirdPart);

        if (firstPart.length() == 3)
            firstCondition = true;
        if (secondPart.length() == 2)
            secondCondition = true;
        if (thirdPart.length()==4)
            thirdCondition=true;
        if (firstCondition && secondCondition && thirdCondition)
            System.out.println(ssn+ " is a valid SSN");
        else
            System.out.println(ssn+ "is an invalid SSN");
    }
}

