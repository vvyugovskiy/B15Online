package practice.Interview;

import java.util.Arrays;
import java.util.LinkedList;

public class Task02_PrintAllAnagramsTogether_Tree {

    /*

    1) Create an empty Trie
    2) One by one take all words of input sequence. Do following for each word
    …a) Copy the word to a buffer.
    …b) Sort the buffer
    …c) Insert the sorted buffer and index of this word to Trie. Each leaf node of Trie is head of a Index list. The Index list stores index of words in original sequence. If sorted buffe is already present, we insert index of this word to the index list.
    3) Traverse Trie. While traversing, if you reach a leaf node, traverse the index list. And print all words using the index obtained from Index list.

     */

    static final int NO_OF_CHARS = 26;

    // class to represent a Trie Node
    static class TrieNode {
        boolean isEnd;  // indicate end of word

        //26 slots each for 'a' to 'z'
        TrieNode[] child = new TrieNode[NO_OF_CHARS];

        LinkedList<Integer> head;

        // constructor
        public TrieNode() {

            isEnd = false;
            head = new LinkedList<>();
            for (int i = 0; i < NO_OF_CHARS; ++i)
                child[i] = null;
        }
    }

    // a utility function to insert a word to Trie
    static TrieNode insert(TrieNode root, String word, int index, int i) {
        // Base case
        if (root == null) {
            root = new TrieNode();
        }
        if (i < word.length()) {
            int index1 = word.charAt(i) - 'a';
            root.child[index1] = insert(root.child[index1], word, index, i + 1);
        } else {  // if end of he word is reached
            if (root.isEnd = true) {
                root.head.add(index);
            } else { // If Index list is empty
                root.isEnd = true;
                root.head.add(index);
            }
        }
        return root;
    }

    // This function traverses the built trie. When the leaf node is reached,
    // all words connected at that leaf node are anagrams. So it traverses the list at leaf node
    // and uses stored index to print original words
    static void printAnagramsUtil(TrieNode root, String[] wordArr) {
        if (root == null)
            return;

        //If a leaf node is reached, print all anagrams using the indexes stored in index linked list
        if (root.isEnd) {
            // traverse the list
            for (Integer pCrawl : root.head) {
                System.out.print(wordArr[pCrawl]+ " | ");
            }
        }

        for (int i = 0; i < NO_OF_CHARS; i++) {
            printAnagramsUtil(root.child[i], wordArr);
        }
    }

    static void printAnagramsTogether(String[] wordArr, int size) {
        // Create an empty Trie
        TrieNode root = null;

        //Iterate through all input words
        for (int i = 0; i < size; ++i) {
            // Create a buffer for this word and copy the word to buffer
            char[] buffer = wordArr[i].toCharArray();
            // Sort the buffer
            Arrays.sort(buffer);
            // Insert the sorted buffer and its original insert to Trie
            root = insert(root, new String(buffer), i, 0);

        }
        // Traverse the build Trie and print all anagrams together
        printAnagramsUtil(root, wordArr);

    }

    public static void main(String[] args) {

        String wordArr[] = {"cat", "dog", "tac", "god",
                "act", "gdo"};
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);

    }
}