package Cybertek.day29;

public class HeroIdentity {

    public static void main(String[] args) {


        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-***********";

        // given string with hero code and name separated by -
        // turn this String into hero code and ********* with same length as hero name

        // Plain English LOGIC:

        // split it by - to get the code and full name
        // get the length of full name
        // generate stars with same length as full name characters count
        // concatenate herocode with dash and stars and save it

        //OR one star is generated, replace the full name with Stars

        String [] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        int nameCharCount = fullName.length();
        String star = "";
        for (int i = 0; i < fullName.length(); i++) {
            star=star+"*";  // star+="*" ;
        }
        System.out.println(fullName);
        System.out.println(star);
        String heroX = heroCode+"-"+star;
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);

    }
}
