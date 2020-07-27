package practice.Interview;

import java.util.Arrays;
import java.util.Comparator;

public class Task01_PrintAllAnagramsTogether {

    // class for each word of duplicate array
    static class Word {
        String str;    // to store word itself
        int index;      // index of the word in the original array

        Word(String str, int index) {
            this.str = str;
            this.index = index;
        }
    }
    // class to represent duplicate array
    static class DupArray {

        Word[] array; // array of words
        int size;     // size of array

        public DupArray(String[] str, int size) {
            this.size = size;
            array = new Word[size];

            // One by one copy words from the given wordArray to dupArray
            int i;
            for (i = 0; i < size; ++i) {

                // create a  word Object with the
                // str[i] as str and index as i
                array[i] = new Word(str[i], i);
            }
        }
    }

    // Compare two words. Used in Array.sort for sorting an array of words
    static class compStr implements Comparator<Word> {
        public int compare(Word a, Word b) {
            return a.str.compareTo(b.str);
        }
    }
    // Given a list of words in wordArr[],
    static void printAnagramsTogether(String wordArr[], int size) {

        // Step 1: create a copy of all words present in given wordArr.
        // The copy will also have original indexes of words
        DupArray dupArray = new DupArray(wordArr, size);

        // Step 2: Iterate through all words in dupArr and sort individual words
        int i;
        for (i = 0; i < size; ++i) {
            char[] char_arr = dupArray.array[i].str.toCharArray();
            Arrays.sort(char_arr);
            dupArray.array[i].str = new String(char_arr);
        }

        // Step 3: Now sort the array of words in dupArr
        Arrays.sort(dupArray.array, new compStr());

        //Step 4: Now all words in dupArray are together, but they changed.
        // Use the index member of word struct to get the corresponding original word
        for (i = 0; i < size; ++i) {
            System.out.println(wordArr[dupArray.array[i].index] + " ");
        }
    }

    public static void main(String[] args) {
        String [] str = {"cat", "dog", "tac", "god", "act"};
        int size = str.length;

        printAnagramsTogether(str,size);
    }

}
