package day46;

// programmer as a super class
// JavaProgrammer  , SQLProgrammer
// please override and test under Sub classes

//JavaProgrammer:
// unique behaviour: drinkCoffee, doRepl, doJava, doJavaDevelopment

// SQLProgrammer :
// unique behaviour: writeSQLQuery, createDatabase ()

// OVERRIDING IS UNIQUE FOR AN INSTANCE METHOD
// THERE IS NO CONCEPT OF OVERRIDING FOR ANYTHING OTHER THAN INSTANCE METHOD
public class Programmer {

    void code() {
        System.out.println("Any programmers CODE");
    }

    // private void test (){
    void test() {

        System.out.println("Any programmer TEST");
    }
}
