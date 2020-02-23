package day17;

public class FullNameCorrector {
    public static void main(String[] args) {

        String fullName = "dfkgjn dfnLKNMG";
        int firstSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,firstSpace);
        String lastName = fullName.substring(firstSpace+1);
//        System.out.println(firstName);
//        System.out.println(firstName.toUpperCase());
//        System.out.println(firstName.toLowerCase());
        String firstNameCor =
                            firstName.toUpperCase().substring(0,1) +
                            firstName.toLowerCase().substring(1);
        String lastNameCor =
                            lastName.toUpperCase().substring(0,1) +
                            lastName.toLowerCase().substring(1);
//        System.out.println(lastNameCor);
        System.out.println(firstNameCor+" "+lastNameCor);


       //  System.out.println (name.toUpperCase().substring(0,1)+name.toLowerCase().substring(1));
//        int firstSpaceIndex = sentence.indexOf(" ");
//        String firstWord = sentence.substring(0,firstSpaceIndex);
//        System.out.println("firstWord = " + firstWord);
    }
}
