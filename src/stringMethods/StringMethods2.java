package stringMethods;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor search here :");
        String searchKeyword = scan.nextLine();
        String tabTitle = searchKeyword + "- Google Search";
        if (tabTitle.startsWith(searchKeyword) && tabTitle.endsWith("Google Search")){
            System.out.println("Test Has Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
}
