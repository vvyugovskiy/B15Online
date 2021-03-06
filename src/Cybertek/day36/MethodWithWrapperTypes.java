package Cybertek.day36;

public class MethodWithWrapperTypes {
    public static void main(String[] args) {
        // It's expecting 2 Integer object
        // and we used Integer.valueOf to provide 2 Integer Objects
        sumAndPrint(Integer.valueOf(23), Integer.valueOf(10));

        // It's expecting 2 Integer object
        // and we used new keyword to provide 2 Integer Objects
        sumAndPrint(new Integer(23), new Integer(10));

        // i1 is a variable with data type Integer
        // and it can store integer Object
        // what's deal here with 12 ?? -->> autoboxing
        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1, i2);

        // we directly passed int
        // knowing that autoboxing can take care of converting to object
        // if not specified otherwise , this is recommended
        sumAndPrint(23, 10);
        printTheDoubleValue(100);
    }

    /**
     * This method add 2 Integer numbers and print
     *
     * @param num1 type Integer , first number to add
     * @param num2 type Integer , second number to add
     */
    public static void sumAndPrint(Integer num1, Integer num2) {
        // We can not add two object
        // what is happening here is
        // the moment the + operator appeared ,
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int conversion -->> auto-unboxing
        System.out.println(num1 + num2);

    }

    public static void printTheDoubleValue(int x) {
        System.out.println("After doubling : "+ (x * 2));
    }
}
