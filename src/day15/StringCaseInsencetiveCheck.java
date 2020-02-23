package day15;

public class StringCaseInsencetiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println(name.contains("st"));

        // want to check if name contains st no mater the case sensitivity
        // so i want to store the uppercase version
        String uppercaseName = name.toUpperCase(); // ARYA STARK
        System.out.println("uppercaseName ST or not ? " + uppercaseName.contains("ST"));
        String lowercaseName = name.toLowerCase(); // arya stark
        System.out.println("lowercaseName st or not ? " + lowercaseName.contains("st"));

        //    OR

        System.out.println(name.toLowerCase().contains("st"));
    }
}
