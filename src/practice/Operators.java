package practice;

public class Operators {

    public static void main(String[] args) {

        // UNARY
// 1. Unary minus(-): This operator can be used to convert a negative value to a positive one.

        // variable declaration
        int n1 = 17;

        System.out.println("n1 = " + n1);

        // Performing unary operation
        n1 = -n1;

        // Print the result number
        System.out.println("n1 = " + n1);

// 2. ‘NOT’ Operator(!): This is used to convert true to false or vice versa. Basically it reverses the logical state of an operand.

        // unary NOT operator

        // initialising variables
        boolean cont = true;
        int a = 10, b = 1;

        // Displaying cont, a, b
        System.out.println("cont = " + cont);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // using Unary NOT
        System.out.println("Now cont is = " + !cont);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
// 3. Increment (++)
        // post-increment
        // pre-increment

// 4. Decrement (--)
        // post-increment
        // pre-increment
        // initializing variables

        int num = 5;

        // first 5 gets printed and then
        // decremented to 4

        System.out.println("Post decrement = " + num--);

        System.out.println("num = " + num);

        // num was 4, decremented to 3
        // then printed
        System.out.println("Pre decrement = " + --num);

// 5. Bitwise Complement(~): This unary operator returns the one’s complement representation of the input value or operand

        // variable declaration
        int m1 = 6, m2 = -2;

        // Displaying numbers
        System.out.println("First Number = " + m1);
        System.out.println("Second Number = " + m2);

        // Performing bitwise complement
        System.out.println(m1 + "'s bitwise complement = " + ~m1);
        System.out.println(m2 + "'s bitwise complement = " + ~m2);

//  ==
        String s1 = "geeksquiz";
        String s2 = "geeksquiz";
        System.out.println("s1 == s2 is:" + s1 == s2);

        System.out.println("==================================================================");
//  instance of operator

        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
//-------------------------------------------------------------------------------------------------
        String x = null;
        giveMeAString(x);
        System.out.println(x);
//------------------------------------------------------------------------------------------------
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }

    static void giveMeAString(String y) {
        y = "GeeksQuiz";
    }

    // ----------------------------------------------------------------------------------------------
    public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }
}

interface MyInterface {
}

class Person {
}

class Boy extends Person implements MyInterface {
}




