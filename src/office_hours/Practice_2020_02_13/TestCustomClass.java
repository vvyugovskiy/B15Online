package office_hours.Practice_2020_02_13;

public class TestCustomClass {

    public static void main(String[] args) throws NoBreakTimeException{

        //  throw new NoBreakTimeException();
        // method1();

        boolean studentAskForBreak = false;
        if (studentAskForBreak){
            // throw new NoBreakTimeException();  // unchecked
        }else{
            System.out.println("Continue");
        }
    }
    public static void method1() throws NoBreakTimeException{

    }
}
