package practice;

public class FinalizePractice {

    public static void main(String[] args) {
        System.out.println("Start");
        FinalizePractice f1 = new FinalizePractice();
        FinalizePractice f2 = new FinalizePractice();
        f1=null;
        f2=null;
        System.gc();
        System.out.println("End");
    }
    @Override
    public void finalize(){
        System.out.println("Object is about to be garbage collected");
    }
}
