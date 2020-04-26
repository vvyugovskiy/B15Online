package practice;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        // APPLYING ITERATOR TO MODIFY COLLECTIONS

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1));
        // TASK 1:  We want to remove all elements equal to 1 from ArrayList

        Iterator<Integer> it1 = list1.iterator();
        while (it1.hasNext()) {
            int num = it1.next();
            if (num == 1) {
                it1.remove();
            }
        }
        System.out.println("list1 = " + list1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // TASK 2: removing names that contain M letter
        String[] names = {"Alexander", "Michael", "Vladislav", "Maxim", "Parvin", "Irina"};
        Set<String> list2 = new LinkedHashSet<>();
        list2.addAll(Arrays.asList(names));

        Iterator<String> removeM = list2.iterator();
        while (removeM.hasNext()) {
            String str = removeM.next();
            if (!str.toLowerCase().contains("m")) {
                removeM.remove();
            }
        }
        System.out.println("list2 = " + list2);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // TASK 3 : removing values larger than 100 using iterator

        // for loop (1. initialization ; 2. condition; 3. iterator )
        //                 mandatory        mandatory

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(100, 900, 500, 99, 200, 89, 300, 79));

        for (Iterator<Integer> itr = list3.iterator(); itr.hasNext(); ) {
            int numbs = itr.next();
            if (numbs > 100) {
                itr.remove();
            }
        }
        System.out.println(list3);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // TASK 4: removing names from an array using iterator

        String[] students = {"Rauf", "Parvin", "Maxim", "Irina", "Abu-Ibn-Hasan", "Prairies", "Papandopala"};

        List<String> nameList = new ArrayList<>(Arrays.asList(students));
//        nameList.addAll(Arrays.asList(students));
        for (Iterator<String> itr = nameList.iterator(); itr.hasNext(); ){
            String str = itr.next();
            if (str.equals("Papandopala") || str.equals("Maxim")){
                itr.remove();
            }
        }
        System.out.println(nameList);
    }
}
