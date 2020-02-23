package day16;

public class IndexWith2Parameters {
    public static void main(String[] args) {


        // get the second java from the sentence
        // assume you already know there is 4 Java in this sentence
        // second Java ==>the Java right after the first one

        // first find the first Java
        // in order to find second one,
        // instead of searching from beginning, search right after the first Java
        // then it will give you the index of second java

        String name = "I Love Java i Love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",name.indexOf("Java")+1));

        int firstJavaLocation = name.indexOf("Java"); // location of first Java

        int startingPointToSearchSecondJava = firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("Java",startingPointToSearchSecondJava);

       // int startingPointToThirdJava = secondJavaLocation+1;

        System.out.println("second Java Location = " + secondJavaLocation);

        // I do not know how mant word in the sentence. Only there are 3+
        // I just want to know what is the second word;
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ",firstSpaceLocation+1);
        System.out.println("Second word in the sentence is : "+name.substring(firstSpaceLocation+1, secondSpace));

    }
}
