package day47;

public class ExtremeSport extends Sport {

    // can not override
    // but you can do anything else
    // for example you can overload it

    public void doSomething (int x){
        System.out.println("Doing Extreme Sport");
    }

    @Override
    // final work blocks
    // public final void doSomethingElse (){
    public void doSomethingElse (){
        // super.doSomethingElse();
        System.out.println("Do something in ExtremeSport");
    }
}
