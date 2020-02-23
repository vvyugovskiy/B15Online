package replit.$_151_200;
import java.util.*;
public class MethodswithArrayList9_removeAll_199 {

        //  Create a static method that:
        //    is called removeAll
        //    returns nothing
        //    takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
        //  This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.
        //  create your method below

        public static void removeAll (ArrayList<String> wordList, String targetWord){
        // for (int i=wordList.size()-1; i>=0;i--){
        //   if (wordList.get(i).equals(targetWord)){
        //     wordList.remove(wordList.get(i));
        //   }
        // }
        wordList.removeAll(Arrays.asList(targetWord));
    }
}
