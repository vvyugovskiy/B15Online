package day31;

public class MethodPractice2 {

    //write a reusable code to code from 1-10
    //give a name cont1to10                             : method name
    // no need for object when being called             : static
    // it should be accessible anywhere in your project : public
    // it does not return any value                     : void

    public static void count1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        count1to10();
        // System.out.println();
        count1to10();
        // OPTIONALLY can call using classname.methodName();
        MethodPractice2.count1to10();
        // Or can call from different class
        MethodPractice3.countDownFrom20tillOne();

    }
    // DOES NOT MATTER WHERE YOU PUT THE METHOD
    // AS LONG AS IT'S INSIDE THE CLASS { }
    // AND OUTSIDE ANY OF THE METHOD
}

