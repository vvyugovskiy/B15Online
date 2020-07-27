package Cybertek.day26;

public class toCharArrayPractice {
    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray(), another is split(bySomething)
        
        String survey = "Complete B15 Online 1 Month Survey";
        
        char [] surveyChars = survey.toCharArray();

        for (char eachChar : surveyChars) {
            System.out.print(" "+eachChar);
        }
        System.out.println();
// WHILE LOOP
        int x=0;
        while (x<surveyChars.length){
            System.out.println(surveyChars[x]);
            x++;
        }

// FOR LOOP WAY
        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println(surveyChars[i]);
        }

// DO WHILE LOOP
        int j=0;
        do{
            System.out.println(surveyChars[j]);
            j++;
        }while (j<surveyChars.length);

    }
}
