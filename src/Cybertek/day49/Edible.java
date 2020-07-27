package Cybertek.day49;

// interface is like a contract
// once it signed it takes ALL details from it
public interface Edible {

    // ALL variables is PUBLIC STATIC FINAL in INTERFACE: CONSTANT
    // name is ALL_CAPS
    public static final boolean IS_HUMAN_FOOD = true;

    // ALL methods automatically public abstract
    public abstract void eat ();
    public abstract void drink ();

    // default method was add with java8
    // Will inclement for every Child class as is
    // OR override it according to its own requirements
    // DEFAULT ONLY exist in an INTERFACE
    // default keyword here IS NOT AN ACCESS MODIFIER !!!
    // A default method MUST HAVE BODY !!!
    // implicitly default method is PUBLIC
    public default void digest (){
        System.out.println("Digesting the food");
    }

}
