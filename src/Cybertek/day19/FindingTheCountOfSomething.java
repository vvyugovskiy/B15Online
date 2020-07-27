package Cybertek.day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        //from 1-100 printout all the number could be devided by 15 without remainder

        //from 1-100 count how many numbers can be divided by 15
//        int counter = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println(i);
//                // counter = counter+1;
//                // counter +=1 ;
//                ++counter;
//            }
//
//        }
//        System.out.println("counter " + counter);


        // given a String with value
        // find out how many a showed in the String

        String name = "Vladislav Vladimirovich";

        // System.out.println(name.charAt(0) == 'a');

        int countOfA = 0;
        for (int index = 0; index < name.length(); index++) {
            System.out.println(name.charAt(index));
            if (name.charAt(index) == 'a') {
                // System.out.println("BINGO");
                ++countOfA;
            }
        }
        System.out.println(countOfA);

    }


}
