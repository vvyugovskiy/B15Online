package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {

    public static void main(String[] args) {

        HourlyEmployee he1 = new HourlyEmployee
                ("Alex", 911, 70,120);
        he1.calculateAnnualSalary();
        System.out.println(he1);
        System.out.println("Annual salary" + he1.annualSalary);

        FullTimeEmployee ft1 = new FullTimeEmployee
                ("Vladislav", 117,12000);
        ft1.calculateAnnualSalary();
        System.out.println(ft1);
        System.out.println(ft1.annualSalary);

        FullTimeEmployee ft2 = new FullTimeEmployee
                ("Alexey",104,13000);
        ft2.calculateAnnualSalary();
        System.out.println(ft2);
        System.out.println(ft2.annualSalary);


    }
}
