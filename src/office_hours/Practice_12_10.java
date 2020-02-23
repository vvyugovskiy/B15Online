package office_hours;


import java.util.Arrays;

public class Practice_12_10 {
    public static void main(String[] args) {

        String[] cars = {"bmw", "wv", "audi"};
        //                  0     1       2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // for each loop
        // temporary  value  :   array name
        for (String carModel : cars) {
            System.out.println("I'm done assigning the car " + carModel);
        }
        System.out.println("===============================================================");
        //             0  1  2 3  4
        int[] ages = {23, 43, 5, 7, 87};
        System.out.println(ages[2]);
        System.out.println(ages[3] - ages[2]); // 2
        //                    7   -  5
        //                        2
        for (int ageOfStudent : ages) {
            System.out.println("This students age is : " + ageOfStudent);
        }
        System.out.println("I'm done");

        System.out.println(Arrays.toString(ages));

    }
}