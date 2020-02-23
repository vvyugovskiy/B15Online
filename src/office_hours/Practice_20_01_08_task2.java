package office_hours;

import java.util.ArrayList;
import java.util.List;

public class Practice_20_01_08_task2 {

    public static void main(String[] args) {

        //Given List of names with various character count,
        //Remove any name with less than 2 characters
        //and if any name has more than 10 character only keep 10 characters
        //and if it has exactly 5 characters , reverse it
        //Of course , Optionally make a method out of it.

        System.out.println(nameCharsToList("Vladislav"));
        List<Character> resultList = nameCharsToList("Vladislav");
        resultList.add('M');
        System.out.println("resultList = " + resultList);
    }

    public static List<Character> nameCharsToList(String name) {
        List<Character> charLst = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));
        }

        return charLst;
    }
}
