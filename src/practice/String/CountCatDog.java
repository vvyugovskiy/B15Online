package practice.String;

import java.util.Scanner;

public class CountCatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String str = scan.next();
        System.out.println(catDogCount(str));
    }
    public static boolean catDogCount (String str){
        int countOfCat = 0;
        int countOfDog = 0;
        String strOfDog = str;
        while(str.contains("cat")){
            str = str.substring(str.indexOf("cat")+3);
            countOfCat++;
        }
        while(strOfDog.contains("dog")){
            strOfDog=strOfDog.substring(strOfDog.indexOf("dog")+3);
            countOfDog++;
        }
        return countOfCat==countOfDog;
    }
}
