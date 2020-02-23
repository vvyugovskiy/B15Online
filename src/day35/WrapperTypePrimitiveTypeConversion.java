package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100; // -->> auto=boxing 100-->> new Integer (100)
        // Integer.valueOf(....) is a method that return Integer Object
        // It has 2 overloaded version
        // BOTH Return Integer Object
        int num2 = Integer.valueOf("200"); // auto-boxing into 200

       //  int num3 = "200";   -->> CAN NOT BE DONE BY ITSELF
       // int year = Integer.parseInt(caseNumber.split("-")[0].substring(3,7));
        int num3 = Integer.parseInt("200");
        System.out.println(num3);

//        String caseNumber = "IPR2012-00001";
//        System.out.println(year);
        System.out.println(getYearOutOfCaseNumber("DER2019=00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009=01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2012=00001"));
    }
    public static int getYearOutOfCaseNumber (String caseNumber){

//        int year; //-get 2012 out of it
//        String stringYear=caseNumber.substring(3,7);
//        year=Integer.parseInt(stringYear);
//        return year;
        return Integer.parseInt(caseNumber.substring(3,7));
    }
}
