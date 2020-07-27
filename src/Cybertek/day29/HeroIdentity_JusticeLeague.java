package Cybertek.day29;

public class HeroIdentity_JusticeLeague {

    public static void main(String[] args) {


        String [] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeroes) {
            // System.out.println(eachHero);
            // assume this could be any hero
            String hero1 = eachHero;
            // hide this hero identity
            // String heroX = "Superman-***********";

            String [] heroSplitted = hero1.split("-");
            String heroCode = heroSplitted[0];
            String fullName = heroSplitted[1];

            // int nameCharCount = fullName.length();
            String star = "";
            for (int i = 0; i < fullName.length(); i++) {
                star=star+"*";  // star+="*" ;
            }
            String heroX = heroCode+"-"+star;
            //System.out.println("hero1 = " + hero1);
            System.out.println("heroX = " + heroX);
        }

//        // assume this could be any hero
//        String hero1 = "Superman-Clark J Kent";
//        // hide this hero identity
//        // String heroX = "Superman-***********";
//
//        String [] heroSplitted = hero1.split("-");
//        String heroCode = heroSplitted[0];
//        String fullName = heroSplitted[1];
//
//        // int nameCharCount = fullName.length();
//        String star = "";
//        for (int i = 0; i < fullName.length(); i++) {
//            star=star+"*";  // star+="*" ;
//        }
//        String heroX = heroCode+"-"+star;
//        System.out.println("hero1 = " + hero1);
//        System.out.println("heroX = " + heroX);

    }
}
