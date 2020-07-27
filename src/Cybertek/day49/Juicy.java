package Cybertek.day49;


public interface Juicy {

    public abstract void melt();
    // another type of method interface hace is static method
    // that MUST have a body
    // provides utility methods
    // that does not belong to any class
    // Static method of Interface IS NOT INHERITED

    public static void squeeze() {
        System.out.println("static squeezing");
    }

}
