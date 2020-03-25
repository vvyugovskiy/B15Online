package practice.OCA;


public class Exam_Part3 {

    public static void main(String[] args) {

        //1.
//      public class CheckingAccount {
//
//    public int amount;
//    public CheckingAccount(int amount) {
//        this.amount = amount;
//    }
//    public int getAmount() {
//        return amount;
//    }
//    public void changeAmount(int x) {
//        amount += x;
//    }
//    public static void main(String[] args) {
//        Which three lines, when inserted independently at line n1, cause the program to print a 0?
//        CheckingAccount acct = new CheckingAccount(1000);
//        -------------------------------------------------------
//        amount = 0;
//        acct.amount = 0;              <<<====
//        this.amount = 0;
//        acct (0) ;                                              // line n1
//        acct. getAmount ( ) = 0;
//        acct.changeAmount(-acct.amount);        <<<===
//        acct.changeAmount(-acct.getAmount( ));    <<<===
//      ----------------------------------------------------------
//        System.out.println(acct.getAmount());

        //2.

//    }
//    private double length;
//    private double heigth;
//    private double area;
//    public void setLength (double length){
//        this.length = length;
//    }
//    public void setHeigth (){
//        this.heigth = heigth;
//    }
//    public void setArea(){
//        area = length*heigth;
//        Which two changes would encapsulate this class and ensure that the area field is always equal to length * height whenever the Rectangle class is used?

//        Call the setArea method at the beginning of the setHeight method.
//        Call the setArea method at the end of the setLength method.       <<<====
//        Call the setArea method at the beginning of the setLength method.
//        Call the setArea method at the end of the setHeight method.       <<<====
//        Change the setArea method to private.

        //3.

//        public class Test {
//
//            int x, y;
//
//            public Test(int x, int y) {
//                initialize(x, y);
//            }
//
//            public void initialize(int x, int y) {
//                this.x = x * x;
//                this.y = y * y;
//            }
//
//            public static void main(String[] args) {
//                int x = 3, y = 5;
//                practice.OCA.Test obj = new practice.OCA.Test(x, y);
//                System.out.println(x + " " + y);   ===>>> 3 5

        //4.

//        public class Employee {
//
//            String name;
//            boolean contract;
//            double salary;
//
//            public Employee() {
//   // Line 1 ----------------------------------------------------
//                this.name = new String("Joe");
//                this.contract = new Boolean (true);                                 <<<===
//                this.salary = new Double;
//        -------------------------------------------------------------
//            }
//            public String toString() {
//                return name + " : " + contract + " : " + salary;
//            }
//            public static void main(String[] args) {
//                practice.OCA.Employee e = new practice.OCA.Employee();
//   // Line 2      -----------------------------------------------------
//                e.name = "Joe";
//                e.contract = true;                               <<<====
//                e.salary = 100;
//           ------------------------------------------------
//                System.out.println(e);

        //5.

//    public class Planet {
//
//    public String name;
//    public int moons;
//
//    public Planet(String name, int moons) {
//        this.name = name;
//        this.moons = moons;
//    }
//
//    public static void main(String[] args) {
//        Planet[] planets = {
//                new Planet("Mercury", 0),
//                new Planet("Venus", 0),
//                new Planet("Earth", 1),
//                new Planet("Mars", 2)
//        };
//        System.out.println(planets);          ===>>> Hashcode
//        System.out.println(planets[2]);       ===>>> Hashcode
//        System.out.println(planets[2].moons); ===>>> 1

        //6.

//public class CheckingAccount {

//    public int amount;
//    // Line 1  ------------------------------------------------
//    public  CheckingAccount (  ) {
//        this.amount = 100;                            <<<===
//    }
//        -------------------------------------------------------
//    public  CheckingAccount (  ) {
//        this.amount = 100;                            <<<===
//    }
//        -------------------------------------------------------
//    public static void main(String[] args) {
//        CheckingAccount acct = new CheckingAccount();
//        // Line 2
//        acct.amount = 100;                            <<<===
//        System.out.println(acct.amount);

        //7.


//        Given the following array:
//
//        int[] intArr = {8, 16, 32, 64, 128};
//
//        Which two code fragments, independently, print each element in this array?
//        -------------------------------------------------------
//        for ( int i  =  0; i < intArr.length ;  i++ ) {
//            System.out.print ( intArr[i] +" " );                <<<===
//        }
//        -------------------------------------------------------
//        for ( int  i : intArr ) {
//            System.out.print ( i + " " );                      <<<===
//        }

        //8.

//        Which three statements describe the object-oriented features of the Java language?
//        A main method must be declared in every class
//        Objects can share behaviors with other objects       <<<===
//        Object is the root class of all other objects        <<<===
//        objects cannot be reused
//        A package must contain more than one class
//        A subclass can inherit from a superclass             <<<===

        //9.

//  package p1;
//        public class Acc {
//            int p;
//            private int q;
//            protected int r;
//            public int s;
//        }
//  package p2;
//  import p1.Acc;
//        public class Test extends Acc {
//            public static void main(String[] args) {
//                Acc obj = new Acc();
//            }                                                        //===>>>  Only s accessible by obj

        //10.

//        class Vehicle {
//            int x;
//
//            Vehicle() {
//                this(10); // Line 1
//            }
//
//            Vehicle(int x) {
//                this.x = x;
//            }
//        }
//        public class Car extends Vehicle {
//            int y;
//
//            Car() {
//                super();
//                this(20); // Line 2     <<<=== FAILS AT LINE 2, have 2 constructors instead of 1
//            }
//
//            Car(int y) {
//                this.y = y;
//            }
//
//            public static void main(String[] args) {
//                Vehicle y = new Car();
//                System.out.println(y);

        //11.

//        class Caller {
//            private void init() {
//                System.out.println("Initialized");
//            }
//
//            private void start() {
//                init();
//                System.out.println("Started");
//            }
//        }
//        public class TestCall {
//            public static void main(String[] args) {
//                Caller C = new Caller();
//                C.start();             <<<===has private access
//                C.init();              <<<===has private access

        //12.

//        class A {
//            public A() {
//                System.out.print("A ");
//            }
//        }
//        class B extends A {
//            public B() {             // Line 1
//                System.out.print("B ");
//            }
//        }
//        class C extends B {
//            public C(){             // Line 2
//                System.out.print("C ");
//            }
//        }
//        public class Test {
//            public static void main(String[] args) {
//                C c = new C();                         ===>>>  A B C

        //13.

//        public class Person {
//
//            String name;
//            int age = 25;
//
//            public Person(String name) {
//                this();     // Line n1             <<<=== ERROR, Calling not existing constructor!
//                setName(name);
//            }
//
//            public Person(String name, int age) {
//                Person(name);   // Line n2         <<<=== ERROR
//                setAge(age);
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//            public int getAge() {
//                return age;
//            }
//
//            public void setAge(int age) {
//                this.age = age;
//            }
//
//            public String show (){
//                return name + " " + age;
//            }
//
//            public static void main(String[] args) {
//                Person p1 = new Person("JESSE");
//                Person p2 = new Person("Walter",53);
//                System.out.println(p1.show());
//                System.out.println(p2.show());

        //14.

//        public class Vowl {
//
//            private char var;
//
//            public static void main(String[] args) {
//
//                char var1 = 'a';
//                char var2 = var1;
//
//                Vowl obj1 = new Vowl();
//                Vowl obj2 = obj1;
//
//                obj1.var = 'i';
//                obj2.var = 'o';
//                System.out.println(var1 + ", " + var2);          ===>>> a, a
//                System.out.println(obj1.var + ", " + obj2.var);  ===>>> o, o

        //15.

//        public class Test {
//
//            static  int count = 0;
//            int i = 0;
//
//            public void changeCount (){
//                while (i<5){
//                    i++;
//                    count++;
//                }
//            }
//            public static void main(String[] args) {
//                Test check1 = new Test();
//                Test check2 = new Test();
//
//                check1.changeCount();
//                check2.changeCount();
//                System.out.println(check1.count + " : "+ check2.count);  ==>> 10 : 10

        //16.

//        public class Product {
//
//                    int id;
//                    String name;
//
//                    public Product(int id, String name) {
//                        this.id = id;
//                        this.name = name;
//                    }
//                    public static void main(String[] args) {
//                        Product p1 = new Product(101, "Pen");
//                        Product p2 = new Product(101, "Pen");
//                        Product p3 = p1;
//
//                        boolean ans1 = p1 == p2;                                    //==>> false
//                        boolean ans2 = p1.name.equals(p2.name);                     //==>> true
//
//                        System.out.println(ans1 + ":" + ans2);

        //17.

//class Employee {
//    public int salary;
//}
//class Manager extends Employee {
//    public int budget;
//}
//class Director extends Manager {
//    public int stockOptions;
//}
//public class Test {
//    public static void main(String[] args) {
//        Employee elmployee = new Employee();
//        Manager manager = new Manager();
//        Director director = new Director();
        // Line n1
//        employee.salary = 50_000;
//        director.stockOptions = 1_000;
//        manager.budget = 1_000_000 ;
//        manager.stockOption = 500;                 <<<=== FAIL
//        director.salary = 80_000;
//        Correct Answer employee.budget = 200_000;  <<<=== FAIL

        //18.

//        interface Readable {
//            public void readBook();
//            public void setBookMark();
//        }
//        abstract class Book implements Readable { // Line n1
//            public void readBook() {
//            }
//            // Line n2
//            //public abstract void setBookMark();
//        }
//        public class EBook extends Book { // Line n3
//            public void readBook() {
//            }
//            // Line n4
//            //public void setBookMark(){}  //           <<<====  Insert line n4
//            public static void main(String[] args) {
//                EBook book1 = new EBook();
//                book1.readBook();
//            }
//        }

        //19.

//        abstract class Planet{
//            protected void resolve (){}; // Line n1
//            abstract void rotate ();     // Line n2
//        }
//        public class Earth extends Planet {
//
//            void resolve (){};          // Line n3  make it public or private
//            protected void rotate (){}  // Line n4

        //20.

//        You are asked to develop a program for a shopping application, and you are given the following information:
//
//        *The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass of the other two classes.
//        *The int calculatePrice(Toy t) method calculates the price of a toy.
//        *The void printToy(Toy t)method prints the details of a toy.
//        Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?
//------------------------------------------------------------------------
//        public abstract class Toy{
//            public int calculatePrice(Toy  t);
//            public void printToy(Toy  t);
//        }
//------------------------------------------------------------------------
//        public abstract class Toy {
//            public abstract int calculatePrice( Toy  t );
//            public void printToy( Toy  t ){    /* code goes here*/  }          <<<==== WORKS FINE
//        }
//------------------------------------------------------------------------
//        public abstract class Toy{
//            public abstract int calculatePrice(Toy t) {  /* code goes here*/  }
//            public abstract void printToy(Toy t) {  /* code goes here*/  }
//        }
//------------------------------------------------------------------------
//        public abstract class Toy{
//            public int calculatePrice( Toy  t );
//            public final void printToy( Toy  t ) {  /* code goes here*/   }
//        }
//------------------------------------------------------------------------

        //21.

//        public class MarkList {
//
//            int num;
//
//            public static void graceMarks(MarkList obj4) {
//                obj4.num += 10;
//            }
//
//            public static void main(String[] args) {
//                MarkList obj1 = new MarkList();
//                MarkList obj2 = obj1;
//                MarkList obj3 = null;
//
//                obj2.num = 60;
//                graceMarks(obj2);                   ===>>> 1 object created at RUNTIME

        //22.

//        public class MyField {
//            int x, y;
//
//            public void doStuff(int x, int y) {
//                this.x = x;
//                y = this.y;
//            }
//
//            public void display() {
//                System.out.println(x + " " + y + " : ");
//            }
//
//            public static void main(String[] args) {
//
//                MyField m1 = new MyField();
//                m1.x = 100;
//                m1.y = 200;
//
//                MyField m2 = new MyField();
//                m2.doStuff(m1.x, m1.y);
//                m1.display();
//                m2.display();

        //23.

//        class C2 {
//            public void displayC2(){
//                System.out.println("C2");
//            }
//        }
//        interface I{
//            public void displayI();
//        }
//        class C1 extends C2 implements I{
//            public static void main(String[] args) {
//
//                C2 obj1 = new C1();
//                I obj2 = new C1();
//
//                C2 s = obj2;
//                I t = obj1;
//
//                t.displayI();
//                s.displayC2();     ===>>> COMPILE ERROR

        //24.
//        сlass X {
//
//            static int i;
//            int j;
//
//            public static void main(String[] args) {
//                practice.OCA.t3.X x1 = new X();
//                X x2 = new X();
//
//                x1.i = 3;
//                x1.j = 4;
//                x2.i = 5;
//                x2.j = 6;
//                System.out.print(x1.i+":"+x1.j+":"+x2.i+":"+x2.j);  ==>> 5 : 4 : 5 : 6
//            }
//        }

        //25.

//        interface Downloadable {
//            public void download();
//        }
//        interface Readable extends Downloadable { // Line n1
//            public void readBook();
//        }
//        abstract class Book implements Readable {
//
//            public void readBook() {
//                System.out.println("Read Book");
//            }
//        }
//        public class VBook extends Book { // Line n3      <<<=== ERROR at line 3, Download method is not implemented
//            public void readBook() {
//                System.out.println("Read E-Book");
//            }
//            public static void main(String[] args) {
//                Book book1 = new VBook();
//                book1.readBook();
//            }
//        }

        //26.


//        class A4 {
//            protected static final int i;     <<<=== final must be initialized!
//
//            private void doStuff() {
//            }
//        }
//--------------------------------------------------
//        final abstract class A5 {         <<<==== abstract CAN not be final
//            protected static int i;
//            void doStuff (  ){    }
//            abstract void doIt (   );
//        }

        //27.

//        class Alpha {
//            int ns;
//            static int s;
//
//            Alpha(int ns) {
//                if (s < ns) {
//                    s = ns;
//                    this.ns = ns;
//                }
//            }
//            void doPrint() {
//                System.out.println("ns = " + ns + " s = " + s);
//            }
//        }
//        public class TestA {
//            public static void main(String[] args) {
//
//                Alpha ref1 = new Alpha(50);
//                Alpha ref2 = new Alpha(125);
//                Alpha ref3 = new Alpha(100);
//
//                ref1.doPrint();    ==>>  50 : 125
//                ref2.doPrint();    ==>> 125 : 125
//                ref3.doPrint();    ==>>  0  : 125
//            }
//        }

        //28.

//        class TestX {
//            public static int stVar = 100;
//            public int var = 200;
//
//            public String toString() {
//                return var + " : " + stVar;
//            }
//        }
//        public class ClassX {
//
//            public static void main(String[] args) {
//
//                TestX t1 = new TestX();
//                t1.var = 300;
//                System.out.println(t1);   ==>>  300 : 100
//                TestX t2 = new TestX();
//                t2.stVar = 300;
//                System.out.println(t2);  ==>>  200 : 300

        //29.


    }
}