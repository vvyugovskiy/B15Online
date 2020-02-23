package stringMethods;

import java.util.Scanner;

public class StringMethods5 {
    public static void main(String[] args) {

//        given a name with prefix, stored in a String variable called name
//        for example
//        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
//                -- in case insensitive condition ----
//        print as below
//        if the name Started with (Dr )-->> Doctor
//        if the name Started with (Mr )-->> Male
//        if the name Started with (Miss )-->> Single female
//        if the name Started with (Mrs )-->> Married female

        Scanner scan = new Scanner(System.in);
        System.out.println("A name with their Prefix");
        String name = scan.nextLine();
        String upCase = name.toUpperCase();

        if (upCase.startsWith("DR ")) {
            System.out.println("Doctor");
        } else if (upCase.startsWith("MR ")) {
            System.out.println("Male");
        } else if (upCase.startsWith("MISS ")) {
            System.out.println("Single Female");
        } else if (upCase.startsWith("MRS ")) {
            System.out.println("Married female");
        }else{
            System.out.println("Invalid Prefix");
        }


    }
}
