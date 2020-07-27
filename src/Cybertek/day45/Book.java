package Cybertek.day45;

// if we do not explicitly (manually) extend another class
// we always automatically extend Object class
// Object class is super class of all the classes in Java
public class Book extends Object {
    public static void main(String[] args) {

        Book b1 = new Book();
        System.out.println("b1 = " + b1.toString());
    }

    @Override // this is called annotation,
    // making it obvious to declare we are rewriting the inherited super class method
    public  String toString (){
        return "my own version of toString";
    }
}
