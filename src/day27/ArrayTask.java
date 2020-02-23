package day27;

public class ArrayTask {
    public static void main(String[] args) {


        //Task01;
        // write a program that can find  the minimum number from an array
        // DO NOT USE SORT Method

        int []scores = {100,8897,654,32, 1231, 224, 556,7,1,2,3,4,};
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (min>scores[i]){
                min=scores[i];
            }
        }
        System.out.println("Minimum number ="+min);
        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
//            if (scores[i]==min){
//                continue;
//            }
            if (secondMin>scores[i]&& scores[i]!=min){
                secondMin=scores[i];
            }
        }
        System.out.println("Second MIn = "+secondMin);
        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
//            if (scores[i]==min || scores[i]==secondMin){
//                continue;
//            }
            if (thirdMin >scores[i]&& scores[i]!=min && scores[i]!=secondMin){
                thirdMin=scores[i];
            }
        }
        System.out.println(thirdMin);
    }
}
