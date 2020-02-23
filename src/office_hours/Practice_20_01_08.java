package office_hours;

import java.util.ArrayList;
import java.util.List;

public class Practice_20_01_08 {

    public static void insert100BetweenItemsOfList (List<Integer> numbers){
        for (int i = 1; i <= numbers.size() - 1; i+=2) {
            numbers.add(i,100);
        }
    }
    public static void main(String[] args) {

        //Given a ArrayList of 6 Integer 1,3,7,2,12,7
        //insert 100 in between each numbers
        //For example :
        //1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
        //Optionally make it a method
        //write a static void method that accept a ArrayList of integer object and insert 100 in between items.

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);
        System.out.println("numbers = " + numbers);
       // numbers.add(numbers.size()-1,100);
        insert100BetweenItemsOfList(numbers);
        System.out.println("Numbers after inserting : "+numbers);
    }
}
