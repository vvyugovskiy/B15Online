package day17;

public class OnlyEvenNumbers {
    public static void main(String[] args) {

        int num = 100;
        while (num >= 0) {
            if (num % 2 == 0) {
                System.out.println(num + " Even number");
            }
            --num;
        }
    }
}
//    int num = 100;
//​
//        while (num>=0){
//        ​
//        if(num % 2 == 0){
//        ​
//        System.out.println(num+ " is even number");
//        }else {
//        }
//        --num;