package Cybertek.day47;

    // can not extend final class
    // public final class Sport {   }   extends String {

public class Sport {

    // final method can not be overridden in sub class
    // it can be just as is sub class

    public final void doSomething (){
        System.out.println("Doing regular sport");
    }

    public void doSomethingElse (){
        System.out.println("Something else");
    }

}

