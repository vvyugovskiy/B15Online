package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        int num = 10;
//        int num;   --> just because we can!
//        num=10;
        // creating an array in second way
        int [] ages = new int[]{3,5,11,33,57,18};
        // int [] ages;
        // ages = new int[]{3,5,11,33,57,18};
        int itemCount = ages.length;
        System.out.println(itemCount);

        for (int x = 0; x < itemCount; x++) {
            System.out.print(ages[x]+" ");
        }
        System.out.println();
        int [] areaCode = {703,300,954,665};

        for (int x = 0; x < areaCode.length; x++) {
            System.out.print (areaCode[x]+" ");
        }
    }
}
