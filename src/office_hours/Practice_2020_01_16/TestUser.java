package office_hours.Practice_2020_01_16;

public class TestUser {
    int a;

    public static void main(String[] args) {
        //  ClassName   ReferenceName = new  ExistingConstructor;
        TestUser t = new TestUser();
        //  System.out.println(t.a);
        UserInfo Alisa = new UserInfo();  // to call the insatnce of the class
        //Alisa.userName = "Alisa";
        // System.out.println( Alisa.userName );  private is not accessible outside class
        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());
        Alisa.setSSN("123456");
        System.out.println(Alisa.getSSN());
        UserInfo Kamran = new UserInfo();

        System.out.println(Kamran.getUserName());
        System.out.println(Kamran.getSSN());
    }
}


