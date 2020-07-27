package Cybertek.day27;

public class MultiDimentionslArray_Practice {
    public static void main(String[] args) {

        String[] devTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalists = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {devTeam, testerTeam, businessAnalists};
        int maxLenght = scrumTeam[0][0].length();
        String longersString = "";
        for (String[] each1Darray : scrumTeam) {
            for (String eachElement : each1Darray) {
                if (maxLenght < eachElement.length()) {
                    maxLenght = eachElement.length();

                    longersString = eachElement;
                }
            }

        }
        System.out.println(maxLenght);
        System.out.println(longersString);
    }
}
