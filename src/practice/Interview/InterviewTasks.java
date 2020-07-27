package practice.Interview;

import java.util.*;

public class InterviewTasks {

    public static void main(String[] args) {

//        reverseString("Hello World!");
//        reverseStringWithStrBuilder("Vladislav Vyugovskiy");
//        isAnagram("Dormitory", "Dirty Room");
//        bubbleSort(new int [] {99,4,1,17,-6,0,90,17,});
//        bubbleSortForString("vladislav");
//        allPrimes(99);
//        System.out.println(ifPalindrome("anna"));
//        System.out.println(longestPalindrome("manabaannanana"));
//        countAllLetters("java");
//        swapWithoutTemp(17,9);
        reverseTheArray(new int[]{1, 2, 3, 4, 5, 6, 7});

    }

    public static void reverseTheArray(int[] arr) {

        // reverse Array in Place
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swapWithoutTemp(int a, int b) {
        System.out.println("a = " + a + " | b = " + b);
        a = a + b;  // a(26)=17+9
        b = a - b;  // b(17)=26-9
        a = a - b;  // a(9)=26-17

        System.out.println("a = " + a + " | b = " + b);

    }

    public static void countAllLetters(String str) {

        Map<Character, Integer> charCount = new HashMap<>();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            charCount.put(strArr[i], charCount.getOrDefault(strArr[i], 0) + 1);
        }
        System.out.println(charCount);

    }

    public static String longestPalindrome(String str) {
        String result = "";
        str = str.replace(" ", "");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (ifPalindrome(str.substring(i, j + 1))) {
                    if (str.substring(i, j + 1).length() > result.length()) {
                        result = str.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }

    public static boolean ifPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void allPrimes(int num) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (isPRime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }

    public static boolean isPRime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSortForString(String str) {

        String sorted = "";
        char ss[] = str.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss.length - 1 - i; j++) {
                if (ss[j] > ss[j + 1]) {
                    char temp = ss[j];
                    ss[j] = ss[j + 1];
                    ss[j + 1] = temp;
                }
            }
        }

        for (char each : ss) {
            sorted += each + "";
        }
        System.out.println(sorted);
    }

    public static void reverseString(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i) + "";
        }
        System.out.println(revStr);
    }

    public static void reverseStringWithStrBuilder(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

    public static void isAnagram(String str1, String str2) {

        String a = str1.toLowerCase().replace(" ", "");
        String b = str2.toLowerCase().replace(" ", "");

        if (a.length() != b.length()) {
            System.out.println("Not anagram");
            System.exit(0);
        }
        for (int i = 0; i < a.length(); i++) {
            b = b.replaceFirst(a.charAt(i) + "", "");
        }
        if (b.isEmpty()) {
            System.out.println(str1 + ": and : " + str2 + " is anagrams");
        } else {
            System.out.println(str1 + ": and : " + str2 + " NOT anagrams");
        }
    }

}
