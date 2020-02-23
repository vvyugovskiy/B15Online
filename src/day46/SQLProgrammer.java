package day46;

public class SQLProgrammer extends Programmer {

    // access modifier in sub class
    // can have same visibility or more visibility
    @Override
    protected void code() {
        super.code();
        System.out.println("Writing SQL Query");
    }

    //@Override
    public void test() {
        super.test();
        System.out.println("Test SQL Query");
    }

    public void writeSQLQuery (){
        System.out.println("writing SQL Query");
    }


}
