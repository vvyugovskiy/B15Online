package day21;

public class WarmUp {
    public static void main(String[] args) {
    /*
    given your name stored ina var. myName as String
    Ex. My name is Yourname here:
    1. loop each and every character print them out like this:
            A->y-> N->a->m->e->.....
    2. print the sentence by 2 char. at a time
    or 3 char at a time
    or 4 char at a time
     */
        String name = "My name is Vladislav";
        int charCount = name.length();
        int lastCharIndex = charCount-1;
        for (int i = 0; i < lastCharIndex; i++) {
            if (i !=name.length()) {
                System.out.print(name.substring(i, i + 1) + "->");
            }else{
                System.out.print(name.substring(i,i+1));
            }
            //  01234
//           // Hello
//        System.out.println( myName.substring(0,1)    ); H
//        System.out.println( myName.substring(1,2)    ); e
//        System.out.println( myName.substring(2,3)    ); l
//        System.out.println( myName.substring(3,4)    ); l
//        System.out.println( myName.substring(4,5)    ); o

            //  01234
            //  Hello
            // int x = 0 ;
//        System.out.println( myName.substring(x,x+1)    ); H
            // ++ x ; 1
//        System.out.println( myName.substring(x,x+1)    ); e
            // ++ x ; 2
//        System.out.println( myName.substring(x,x+1 )    ); l
            // ++ x ; 3
//        System.out.println( myName.substring(x,x+1 )     ); l
            // ++ x ; 4
//        System.out.println( myName.substring(x,x+1 )   ); o
            /*

            for hello example: there are two ways to represent when do we keep looping
            if the x value less than or equal to 4 x <=4
            if the x value is less than 5. x<5
             */
        }
        System.out.println();

        for (int j = 0; j < name.length()-3; j ++) {
            System.out.print(name.substring(j, j + 3) + "-> ");
        }
    }
}